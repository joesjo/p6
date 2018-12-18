package moment2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import exceptions.InvalidInputException;
import resources.Array7;
import resources.Array7x7;

public class Array7x7Input extends JPanel {

	private static final long serialVersionUID = 1L;
	private Controller controller;
	public Array7x7 array;
	private Array7 tempArray7;

	// length here is the amount of elements
	private final int array7_LENGTH = 7;
	private final int boxDimX = 50;
	private final int boxDimY = 35;

	// text fields
	private JTextField[] fldArray7Column = new JTextField[7];
	private JTextField[] fldArray7Row = new JTextField[7];
	private JTextField fldColNbr = new JTextField();
	private JTextField fldRowNbr = new JTextField();

	// labels
	private JLabel lblColNbr = new JLabel( "Column nbr:" );
	private JLabel lblRowNbr = new JLabel( "Row nbr:" );

	// buttons 
	private JButton btnReadCol = new JButton( "Read Column" );
	private JButton btnWriteCol = new JButton( "Write Column" );
	private JButton btnReadRow = new JButton( "Read Row" );
	private JButton btnWriteRow = new JButton( "Write Row" );

	// panels
	private JPanel pnlColNbr = new JPanel( new FlowLayout() );
	private JPanel pnlRowNbr = new JPanel( new FlowLayout() );
	private JPanel pnlReadWriteCol = new JPanel( new GridLayout( 3, 1 ));
	private JPanel pnlReadWriteRow = new JPanel( new GridLayout( 3, 1 ));
	private JPanel pnlRW = new JPanel( new GridLayout( 2, 1 ));
	private JPanel pnlColumn = new JPanel(new GridLayout( 7, 1 ));
	private JPanel pnlRow = new JPanel(new GridLayout( 1, 7 ));
	private UserAction action = new UserAction();

	private Border border = BorderFactory.createLineBorder( Color.BLACK, 1 );
	private Font font = new Font( "MonoSpace", Font.PLAIN, 15 );

	// <-- press " - " , too messy
	public Array7x7Input(Controller controller, Array7x7 array) {

		this.controller = controller;
		this.array = array;

		setPreferredSize(new Dimension( 500, 400 ));
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5,5,5,5);

		//Creates the input row and column
		for( int i = 0; i < array7_LENGTH; i++ ) {
			fldArray7Column[i] = new JTextField("0");
			fldArray7Column[i].setFont(font);
			fldArray7Column[i].setHorizontalAlignment(JTextField.CENTER);
			fldArray7Column[i].setPreferredSize( new Dimension( boxDimX, boxDimY ));
			fldArray7Column[i].setBorder(border);
			fldArray7Column[i].addActionListener(this.action);
			pnlColumn.add( fldArray7Column[i] );

			fldArray7Row[i] = new JTextField("0");
			fldArray7Row[i].setFont(font);
			fldArray7Row[i].setHorizontalAlignment(JTextField.CENTER);
			fldArray7Row[i].setPreferredSize( new Dimension( boxDimX, boxDimY ));
			fldArray7Row[i].setBorder(border);
			fldArray7Row[i].addActionListener(this.action);

			pnlRow.add( fldArray7Row[i] );
		}

		fldColNbr.setPreferredSize(new Dimension( boxDimX, boxDimY ));
		fldRowNbr.setPreferredSize(new Dimension( boxDimX, boxDimY ));
		pnlReadWriteCol.setPreferredSize(new Dimension( 300, 130 ));
		pnlReadWriteRow.setPreferredSize(new Dimension( 300, 130 ));
		pnlRW.setPreferredSize(new Dimension( 350, 250 ));

		// adds "Column nbr: " and text field
		pnlColNbr.add( lblColNbr );
		pnlColNbr.add( fldColNbr );

		pnlReadWriteCol.add( pnlColNbr );
		pnlReadWriteCol.add( btnReadCol );
		pnlReadWriteCol.add( btnWriteCol );

		// adds "Row nbr: " and text field
		pnlRowNbr.add( lblRowNbr );
		pnlRowNbr.add( fldRowNbr );

		pnlReadWriteRow.add( pnlRowNbr );
		pnlReadWriteRow.add( btnReadRow );
		pnlReadWriteRow.add( btnWriteRow) ;

		pnlRW.add( pnlReadWriteCol );
		pnlRW.add( pnlReadWriteRow );

		pnlRW.setBorder( border );
		pnlReadWriteCol.setBorder( border );
		pnlReadWriteRow.setBorder( border );

		gbc.gridx = 0;
		gbc.gridy = 0;
		add( pnlRW , gbc );

		gbc.gridx = 1;
		gbc.gridy = 0;
		add( pnlColumn , gbc );

		gbc.gridx = 0;
		gbc.gridy = 1;
		add( pnlRow , gbc );

		//adds action listeners 
		btnReadCol.addActionListener(action);
		btnWriteCol.addActionListener(action);
		btnReadRow.addActionListener(action);
		btnWriteRow.addActionListener(action);
		fldColNbr.addActionListener(action);
		fldRowNbr.addActionListener(action);
	}

	public class UserAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {

			if( e.getSource() == btnWriteCol) {

				if( fldColNbr.getText() == null || Integer.parseInt(fldColNbr.getText()) > array7_LENGTH-1 || Integer.parseInt(fldColNbr.getText()) < 0 ) {
					throw new InvalidInputException("Input must be a numner, between 0 (zero) and 9 (nine): " + fldColNbr.getText());
				}
				else {
					tempArray7 = new Array7();
					for( int i = 0; i < array7_LENGTH; i++ ) {
						tempArray7.setElement(i, Integer.parseInt(fldArray7Column[i].getText()));
					}
					controller.writeColumn(Integer.parseInt(fldColNbr.getText()), tempArray7);
				}
			}

			if( e.getSource() == btnWriteRow) {

				if( fldRowNbr.getText() == null || Integer.parseInt(fldRowNbr.getText()) > array7_LENGTH-1 || Integer.parseInt(fldRowNbr.getText()) < 0 ) {
					throw new InvalidInputException("Input must be a numner, between 0 (zero) and 9 (nine): " + fldRowNbr.getText());
				}
				else {
					for( int i = 0; i < array7_LENGTH; i++ ) {
						tempArray7.setElement(i, Integer.parseInt(fldArray7Row[i].getText()));	
					}
					controller.writeRow(Integer.parseInt(fldRowNbr.getText()), tempArray7);
				}
			}

			if( e.getSource() == btnReadCol ) {
				if( fldColNbr.getText() == null || Integer.parseInt(fldColNbr.getText()) > array7_LENGTH-1 || Integer.parseInt(fldColNbr.getText()) < 0 ) {
					throw new InvalidInputException("Input must be a numner, between 0 (zero) and 9 (nine): " + fldColNbr.getText());
				}
				else {
					controller.readColumn(Integer.parseInt(fldColNbr.getText()));
				}
			}

			if( e.getSource() == btnReadRow ) {
				if( fldRowNbr.getText() == null || Integer.parseInt(fldRowNbr.getText()) > array7_LENGTH-1 || Integer.parseInt(fldRowNbr.getText()) < 0 ) {
					throw new InvalidInputException("Input must be a numner, between 0 (zero) and 9 (nine): " + fldRowNbr.getText());
				}

				else {
					controller.readRow(Integer.parseInt(fldRowNbr.getText()));
				}
			}
		}
	}
}
