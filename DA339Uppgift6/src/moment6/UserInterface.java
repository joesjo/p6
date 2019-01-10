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
	private JPanel pnlUserChoise = new JPanel( new GridLayout(3, 3));
	private JButton[] btnsChoise = new JButton[9];

	public UserInterface( Controller c, int cols, int rows, int color ) {
		this.columns = cols;
		this.rows = rows;

		this.controller = c;
		this.controller.setUI(this, cols, rows, color);
		UserAction action = new UserAction();
		colorDis = new ColorDisplay( rows, cols, Color.BLACK, Color.DKGRAY);
		setLayout( new BorderLayout() );

		fld.addActionListener( action );
		fld.setPreferredSize(new Dimension(100, 40));
		add( colorDis, BorderLayout.CENTER );


		for( int i = 0; i < 9; i++ ) {
			btnsChoise[i] = new JButton();
			btnsChoise[i].addActionListener(action);
			btnsChoise[i].setPreferredSize(new Dimension(70,70));
			pnlUserChoise.add(btnsChoise[i]);
		}

		btnsChoise[0].setText("<^");
		btnsChoise[1].setText("UP");
		btnsChoise[2].setText("^>");
		btnsChoise[3].setText("LEFT");
		btnsChoise[4].setText("PRINT");
		btnsChoise[5].setText("RIGHT");
		btnsChoise[6].setText("<v");
		btnsChoise[7].setText("DOWN");
		btnsChoise[8].setText("v>");

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 3;
		pnlWest.add(pnlUserChoise, gbc);
		pnlWestWest.add(pnlUserChoise, BorderLayout.CENTER);
		pnlWestWest.add(fld, BorderLayout.SOUTH);
		pnlWest.add(pnlWestWest);

		add( pnlWest, BorderLayout.WEST);
	}

	public void updateDisplay(int[][] array) {

		colorDis.setDisplay(array);
		colorDis.updateDisplay();
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

			if( e.getSource() == btnsChoise[4] ) {
				colorDis.clearDisplay();
				controller.setText(fld.getText(), Color.CYAN);
				controller.showText();
			}
			if( e.getSource() == btnsChoise[0]) {
				controller.flowUpLeft();
			}
			if( e.getSource() == btnsChoise[1]) {
				controller.flowUp();
			}
			if( e.getSource() == btnsChoise[2]) {
				controller.flowUpRight();
			}
			if( e.getSource() == btnsChoise[3]) {
				controller.flowLeft();
			}
			if( e.getSource() == btnsChoise[5]) {
				controller.flowRight();
			}
			if( e.getSource() == btnsChoise[6]) {
				controller.flowDownLeft();
			}
			if( e.getSource() == btnsChoise[7]) {
				controller.flowDown();
			}
			if( e.getSource() == btnsChoise[8]) {
				controller.flowDownRight();
			}
		}		
	}


}
