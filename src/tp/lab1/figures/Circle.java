package tp.lab1.figures;

import java.awt.*;
import java.util.List;

/**
 * @author KKV
 * @version 1.0
 * @created 21-Feb-2018 4:59:11 PM
 */
public class Circle extends Ellipse {

	public Circle(Color pouringColor) {
		super(pouringColor);
	}

	@Override
	public void setProvidedPoints(List<Point> points) {
		if (points.size() != numberOfPointsToPaint) {
			throw new RuntimeException("Invalid amount of points provided");
		} else {
			centerPoint = points.get(0);
			firstPoint = points.get(1);
		}
	}

	@Override
	public void draw(Graphics2D graphics2D) {
		int r = (int) centerPoint.distance(firstPoint);

        firstPoint.setLocation(centerPoint.x, centerPoint.y + r);

		super.draw(graphics2D);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}