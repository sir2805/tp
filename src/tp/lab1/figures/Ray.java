package tp.lab1.figures;

import java.awt.*;

import static tp.lab1.DrawingApp.CANVAS_HEIGHT;

/**
 * @author KKV
 * @version 1.0
 * @created 21-Feb-2018 4:59:11 PM
 */
public class Ray extends Segment {

	public Ray(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public void draw(Graphics2D graphics2D) {
		int y = (centerPoint.y < secondPoint.y)?CANVAS_HEIGHT:0;
        int x = centerPoint.x + (secondPoint.x - centerPoint.x) * (y-centerPoint.y) / (secondPoint.y - centerPoint.y);
        secondPoint.setLocation(x, y);
        super.draw(graphics2D);
	}
}