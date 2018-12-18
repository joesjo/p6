package moment2;

import javax.swing.JFrame;

import resources.Array7;
import resources.Array7x7;

public class Controller {

	private Array7x7Viewer viewer;
	private Array7x7 array;

	public Controller(Array7x7Viewer viewer, Array7x7 array) {
		this.viewer = viewer;
		this.array = array;
	}

	public void readRow( int row ) {
		viewer.setRow(array.getRow(row));
	}

	public void readColumn( int column ) {
		viewer.setColumn(array.getCol(column));
	}

	public void writeRow( int row, Array7 arr7) {
		this.array.setRow(row, arr7);
		viewer.setRowInArray(row, arr7);
	}

	public void writeColumn( int column, Array7 arr7) {
		this.array.setCol(column, arr7);
		viewer.setColumnInArray(column, arr7);
	}
}
