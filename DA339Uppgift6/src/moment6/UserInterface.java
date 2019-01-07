package moment6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import resources.*;


public class UserInterface extends JPanel {

	private ColorDisplay colorDis;
	private Controller controller;
	private Color p6color;
	private java.awt.Color awtColor;

	private int columns;
	private int rows;

	private JTextField fld = new JTextField();

	private JPanel pnlWest = new JPanel( new GridBagLayout());
	private JPanel pnlWestWest = new JPanel( new BorderLayout());
	private JPanel pnlUserChoice = new JPanel( new GridLayout(3, 3));
	private JButton[] btnsChoice = new JButton[9];

	public UserInterface( Controller c, int cols, int rows, int color ) {
		this.columns = cols;
		this.rows = rows;
		this.controller = c;
		this.controller.setUI(this, cols, rows, color);
		UserAction action = new UserAction();
		colorDis = new ColorDisplay( rows, cols, Color.BLACK, Color.DKGRAY);
		setLayout( new BorderLayout() );
//		fld.addActionListener( action );
		
		//Add Documentlistener to Textfield fld (textChanged is called whenever fld is called)
		fld.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				textChanged();
			}

			public void insertUpdate(DocumentEvent e) {
				
				textChanged();
			}

			public void removeUpdate(DocumentEvent e) {
			
				textChanged();
			}
		});
		fld.setPreferredSize(new Dimension(100, 40));
		add( colorDis, BorderLayout.CENTER );


		for( int i = 0; i < 9; i++ ) {
			btnsChoice[i] = new JButton();
			btnsChoice[i].addActionListener(action);
			btnsChoice[i].setPreferredSize(new Dimension(70,70));
			pnlUserChoice.add(btnsChoice[i]);
		}

		btnsChoice[0].setVisible(false);
		
		// Up
		btnsChoice[1].setText("\u2191"); 
		btnsChoice[1].setEnabled(false);
		
		
		btnsChoice[2].setVisible(false);
		
		//Left
		btnsChoice[3].setText("\u2190"); 
		btnsChoice[3].setEnabled(false);
		
		//Print
		btnsChoice[4].setEnabled(false);
		btnsChoice[4].setText("PRINT");
		
		// Right
		btnsChoice[5].setText("\u2192"); 
		btnsChoice[5].setEnabled(false);
		
		btnsChoice[6].setVisible(false);
		
		//Down
		btnsChoice[7].setText("\u2193");
		btnsChoice[7].setEnabled(false);
		
		btnsChoice[8].setVisible(false);

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 3;
		pnlWest.add(pnlUserChoice, gbc);
		pnlWestWest.add(pnlUserChoice, BorderLayout.CENTER);
		pnlWestWest.add(fld, BorderLayout.SOUTH);
		pnlWest.add(pnlWestWest);

		add( pnlWest, BorderLayout.WEST);
	}

	public void updateDisplay(int[][] array) {

		colorDis.setDisplay(array);
		colorDis.updateDisplay();
	}
	// Make Up, Down, Left, Right buttons no longer "greyed out"
	private void enableButtons() {
		btnsChoice[1].setEnabled(true);
		btnsChoice[3].setEnabled(true);
		btnsChoice[4].setEnabled(true);
		btnsChoice[5].setEnabled(true);
		btnsChoice[7].setEnabled(true);
	}
	
	// Make Up, Down, Left, Right buttons "greyed out"
	public void disableButtons() {
		btnsChoice[1].setEnabled(false);
		btnsChoice[3].setEnabled(false);
		btnsChoice[4].setEnabled(false);
		btnsChoice[5].setEnabled(false);
		btnsChoice[7].setEnabled(false);
	}
	
	// Called everytime JTextField fld is changed
	// Could me used to update the floating text in real time (as soon as something is changed) but need to rewrite stuff in Controller first.
	public void textChanged() {
		if (fld.getText().length() > 0) {
			enableButtons();
		}
		else {
			disableButtons();
		}
			
		
	}
	
	

	public void update7x7(Array7x7[][] array) {

		for( int i = 0; i < array.length; i++ ) {
			for( int j = 0; j < array[i].length; j++ ) {
				colorDis.setDisplay(array[i][j].toIntArray() , i, j);
			}
		}
		colorDis.updateDisplay();
	}

	public void setCharAtPos( int[][] array, int col, int row ) {
		colorDis.setDisplay(array, col, row);
		colorDis.updateDisplay();
	}
	

	public class UserAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

				
			if (e.getSource() == btnsChoice[4]) {
				colorDis.clearDisplay();
				controller.setText(fld.getText(), Color.CYAN);
				controller.showText();
			}
			if (e.getSource() == btnsChoice[1]) {
				controller.flowUp();
			}
			if (e.getSource() == btnsChoice[3]) {
				controller.flowLeft();
			}
			if (e.getSource() == btnsChoice[5]) {
				controller.flowRight();
			}
			if (e.getSource() == btnsChoice[7]) {
				controller.flowDown();
			} 
		}		
	}


}
