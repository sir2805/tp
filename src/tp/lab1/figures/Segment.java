package tp.lab1.figures;

import java.awt.*;

/**
 * @author KKV
 * @version 1.0
 * @created 21-Feb-2018 4:59:12 PM
 */
public class Segment extends Figure1D {

	public Segment(Color lineColor) {
		super(lineColor);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public void draw(Graphics2D graphics2D) {
		if (centerPoint != null && secondPoint != null) {
		    graphics2D.setColor(lineColor);
			graphics2D.drawLine(centerPoint.x, centerPoint.y, secondPoint.x, secondPoint.y);
		}
	}
}