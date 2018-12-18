package moment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import resources.Array7;
import resources.Array7x7;

public class Test2UI extends JPanel {
	private static final long serialVersionUID = 1L;
	
	// length here is the amount of elements
	private final int array7_LENGTH = 7;
	
	private Controller controller;
	private Array7 array7;

	// all components
	private JLabel[][] lblsArray7x7 = new JLabel[array7_LENGTH][array7_LENGTH];
	private JTextField[] lblsArray7Left = new JTextField[array7_LENGTH];
	private JTextField[] lblsArray7Right = new JTextField[array7_LENGTH];
	private JButton btnLeft = new JButton( "<- Move left <-" );
	private JButton btnRight = new JButton( "-> Move right ->" );
	private JPanel pnlArray7x7 = new JPanel( new GridLayout( 7, 7 ));
	private JPanel pnlArray7Left = new JPanel( new GridLayout( 7, 1 ));
	private JPanel pnlArray7Right = new JPanel( new GridLayout( 7, 1 ));
	private JPanel pnlAllNbrs = new JPanel( new BorderLayout());
	private JPanel pnlBtns = new JPanel( new GridLayout( 1, 2 ));

	private Font font = new Font( "MonoSpace", Font.PLAIN, 15 );
	private Border border = BorderFactory.createLineBorder(Color.WHITE, 4);
	private Border borderArray7 = BorderFactory.createLineBorder(Color.WHITE, 10);
	private Border bigBorder = BorderFactory.createLineBorder(Color.WHITE, 20);
	private UserAction action = new UserAction();

	public Test2UI(Controller controller) {
		this.controller = controller;
		controller.setUI(this);
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);

		for( int i = 0; i < array7_LENGTH; i++ ) {
			for( int j = 0; j < array7_LENGTH; j++ ) {
				lblsArray7x7[i][j] = new JLabel( "0", SwingConstants.CENTER );
				lblsArray7x7[i][j].setFont( font );
				lblsArray7x7[i][j].setBorder( border );
				lblsArray7x7[i][j].setBackground(Color.LIGHT_GRAY);
				lblsArray7x7[i][j].setOpaque(true);
				lblsArray7x7[i][j].setPreferredSize( new Dimension( 50, 50 ));
				pnlArray7x7.add( lblsArray7x7[i][j] );
			}
		}

		for( int i = 0; i < array7_LENGTH; i++ ) {
			lblsArray7Left[i] = new JTextField("0");
			lblsArray7Left[i].setHorizontalAlignment(JTextField.CENTER);
			lblsArray7Left[i].setFont( font );
			lblsArray7Left[i].setPreferredSize( new Dimension( 20 ,20 ));
			lblsArray7Left[i].setBorder( borderArray7 );
			lblsArray7Left[i].setBackground(Color.WHITE);
			lblsArray7Left[i].addActionListener(action);
			pnlArray7Left.add( lblsArray7Left[i] );

			lblsArray7Right[i] = new JTextField ( "0" );
			lblsArray7Right[i].setHorizontalAlignment(JTextField.CENTER);
			lblsArray7Right[i].setFont(font);
			lblsArray7Right[i].setPreferredSize( new Dimension( 20, 20 ));
			lblsArray7Right[i].setBorder( borderArray7 );
			lblsArray7Right[i].setBackground(Color.WHITE);
			lblsArray7Right[i].addActionListener(action);
			pnlArray7Right.add( lblsArray7Right[i] );
		}

		pnlArray7Left.setPreferredSize(new Dimension(50,150));
		pnlArray7Right.setPreferredSize(new Dimension(50,150));

		pnlAllNbrs.add(pnlArray7Left, BorderLayout.WEST);
		pnlAllNbrs.add(pnlArray7x7, BorderLayout.CENTER);
		pnlAllNbrs.add(pnlArray7Right, BorderLayout.EAST);
		pnlAllNbrs.setBorder(bigBorder);
		add(pnlAllNbrs, BorderLayout.CENTER);

		pnlBtns.add(btnLeft);
		pnlBtns.add(btnRight);
		add(pnlBtns, BorderLayout.SOUTH);

		btnLeft.addActionListener(action);
		btnRight.addActionListener(action);

	}

	public void setLeftTempArr() {
		for( int i = 0; i < array7_LENGTH; i++ ) {
			int value = Integer.parseInt(lblsArray7Left[i].getText());
			array7.setElement(i, value);
		}	
	}

	public void setRightTempArr() {
		array7 = new Array7();
		for( int i = 0; i < array7_LENGTH; i++ ) {
			int value = Integer.parseInt(lblsArray7Right[i].getText());
			array7.setElement(i, value);
		}
	}

	public void setArray(Array7x7 arr) {
		array7 = new Array7();
		for( int i = 0; i < array7_LENGTH; i++) {
			for( int j = 0; j < array7_LENGTH; j++ ) {
				lblsArray7x7[i][j].setText(arr.getElement( i, j ) + "");
			}
		}
	}

	public void setLeft(Array7 arr) {
		for( int i = 0; i < array7_LENGTH; i++ ) {
			lblsArray7Left[i].setText(arr.getElement(i) + "");
		}
	}

	public void setRight(Array7 arr) {
		for( int i = 0; i < array7_LENGTH; i++ ) {
			lblsArray7Right[i].setText(arr.getElement(i) + "");
		}
	}

	public class UserAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if( e.getSource() == btnLeft) {
				setRightTempArr();
				controller.moveLeft(array7);	
			}
			if( e.getSource() == btnRight) {
				setLeftTempArr();
				controller.moveRight(array7);
			}
		}
	}
}