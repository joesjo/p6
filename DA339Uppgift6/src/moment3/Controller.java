package moment3;

import resources.Array7;
import resources.Array7x7;


/**
 * Controller for "Test2UI"
 */
public class Controller {
	
	private Array7x7 array7x7;
	private Test2UI ui;
	
	public Controller() {
		this.array7x7 = new Array7x7();
	}
	public void setUI(Test2UI ui) {
		this.ui = ui;
	}
	
	public void moveLeft(Array7 array) {
		array7x7.shiftLeft( array );
		ui.setLeft(array7x7.getTempArray());
		ui.setRight(new Array7());
		ui.setArray(array7x7);
	}
	
	public void moveRight(Array7 array) {
		array7x7.shiftRight( array );
		ui.setRight(array7x7.getTempArray());
		ui.setLeft(new Array7());
		ui.setArray(array7x7);
	}
}
