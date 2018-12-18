package moment2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import resources.Array7;
import resources.Array7x7;

public class Array7x7Viewer extends JPanel {

	private static final long serialVersionUID = 1L;
	private final int boxDimX = 50;
	private final int boxDimY = 35;
	private final int array7Length = 7;

	private JLabel[][] lblArray7x7Instance = new JLabel[array7Length][array7Length];
	private JLabel[] lblArray7Column = new JLabel[7];
	private JLabel[] lblArray7Row = new JLabel[7];

	private JLabel lblColumn = new JLabel("Column", SwingConstants.CENTER );
	private JLabel lblArray7x7 = new JLabel("Array7x7", SwingConstants.CENTER );
	private JLabel lblRow = new JLabel("Row", SwingConstants.CENTER );


	private JPanel pnlArray7x7Instance = new JPanel(new GridLayout( 7, 7 ));
	private JPanel pnlColumn = new JPanel(new GridLayout( 7, 1 ));
	private JPanel pnlRow = new JPanel(new GridLayout( 1, 7 ));


	private Font font = new Font( "MonoSpace", Font.PLAIN, 15 );
	private Border border = BorderFactory.createLineBorder( Color.BLACK, 1 );


	public Array7x7Viewer() {
		setPreferredSize(new Dimension( 450, 350 ));
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5,5,5,5);

		for( int i = 0; i < array7Length; i++ ) {
			for( int j = 0; j < array7Length; j++) {
				lblArray7x7Instance[i][j] = new JLabel( "" + 0, SwingConstants.CENTER );
				lblArray7x7Instance[i][j].setFont( font );
				lblArray7x7Instance[i][j].setBorder( border );
				lblArray7x7Instance[i][j].setPreferredSize(new Dimension( boxDimX, boxDimY ));
				pnlArray7x7Instance.add( lblArray7x7Instance[i][j] );
			}
		}

		for( int i = 0; i < array7Length; i++ ) {
			lblArray7Column[i] = new JLabel( "" + 0 , SwingConstants.CENTER ) ;
			lblArray7Column[i].setFont( font );
			lblArray7Column[i].setBorder( border );	
			lblArray7Column[i].setPreferredSize( new Dimension( boxDimX, boxDimY ));
			pnlColumn.add( lblArray7Column[i] );

			lblArray7Row[i] = new JLabel( "" + 0, SwingConstants.CENTER) ;
			lblArray7Row[i].setFont( font );
			lblArray7Row[i].setBorder( border );
			lblArray7Row[i].setPreferredSize( new Dimension( boxDimX, boxDimY ));
			pnlRow.add( lblArray7Row[i] );
		}

		gbc.gridx = 0;
		gbc.gridy = 0;
		add( lblColumn , gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		add( lblArray7x7, gbc );

		gbc.gridx = 0;
		gbc.gridy = 1;
		add( pnlColumn, gbc );

		gbc.gridx = 1;
		gbc.gridy = 1;
		add( pnlArray7x7Instance, gbc );

		gbc.gridx = 0;
		gbc.gridy = 2;
		add( lblRow, gbc );

		gbc.gridx = 1;
		gbc.gridy = 2;
		add( pnlRow, gbc );
	}

	public void setRow(Array7 arr7) {
		for( int i = 0; i < array7Length; i++) {
			this.lblArray7Row[i].setText(arr7.getElement(i)+ "");
		}
	}

	public void setColumn(Array7 arr7) {
		for( int i = 0; i < array7Length; i++) {
			this.lblArray7Column[i].setText(arr7.getElement(i)+ "");
		}
	}

	public void setRowInArray(int row, Array7 arr7) {
		for( int i = 0; i < array7Length; i++ ) {
			for( int j = 0; j < array7Length; j++) {
				if( i == row) {
					lblArray7x7Instance[i][j].setText(arr7.getElement(j)+ "");
				}
			}
		}
	}

	public void setColumnInArray(int column, Array7 arr7) {
		for( int i = 0; i < array7Length; i++ ) {
			for( int j = 0; j < array7Length; j++) {
				if( j == column) {
					lblArray7x7Instance[i][j].setText(arr7.getElement(i)+ "");
				}
			}
		}
	}

	public void setArray(Array7x7 array) {
		for( int i = 0; i < array7Length; i++ ) {
			for( int j = 0; j < array7Length; j++) {
				lblArray7x7Instance[i][j].setText("" + array.getElement(i, j));
			}
		}
	}
}