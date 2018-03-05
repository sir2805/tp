package tp.lab1.figures;

import java.awt.*;

/**
 * @version 1.0
 * @created 21-Feb-2018 4:59:11 PM
 */
public abstract class Figure2D extends Figure {

	private Color pouringColor;

	public Figure2D(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Color getPouringColor() {
		return pouringColor;
	}

	public void setPouringColor(Color pouringColor) {
		this.pouringColor = pouringColor;
	}
}