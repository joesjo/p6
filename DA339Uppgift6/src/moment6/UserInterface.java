package moment6;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import resources.*;


public class UserInterface extends JPanel {
	
	private ColorDisplay colorDis;
	private Controller controller;
	private Color p6color;
	private java.awt.Color awtColor;
	
	private int columns;
	private int rows;
	
	private JButton btnPrint = new JButton("Print");
	private JTextField fld = new JTextField();
	private JPanel pnlBottom = new JPanel(new GridLayout(1, 2));
	
	public UserInterface( Controller c, int cols, int rows, int color ) {
		this.columns = cols;
		this.rows = rows;
		
		this.controller = c;
		this.controller.setUI(this, cols, rows, color);
		UserAction action = new UserAction();
		colorDis = new ColorDisplay( rows, cols, Color.BLACK, Color.DKGRAY);
		setLayout( new BorderLayout() );
		
		btnPrint.addActionListener( action );
		fld.addActionListener( action );
		add( colorDis, BorderLayout.CENTER );
		pnlBottom.add(fld);
		pnlBottom.add(btnPrint);
		add(pnlBottom, BorderLayout.SOUTH);
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
			
			if( e.getSource() == btnPrint ) {
				
				colorDis.clearDisplay();
				controller.setText(fld.getText(), Color.CYAN);
				controller.showText();
				controller.flowRight();
			}
		}		
	}


}
