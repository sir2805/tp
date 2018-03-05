package tp.lab1.figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.List;

/**
 * @author KKV
 * @version 1.0
 * @created 21-Feb-2018 4:59:11 PM
 */
public class Circle extends Ellipse {

	public Circle() {
		this.numberOfPointsToPaint = 2;
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
		Point p1 = firstPoint;

		double r = centerPoint.distance(p1);

		graphics2D.draw(new Ellipse2D.Double(centerPoint.getX() - r,
				centerPoint.getY() - r, 2 * r,2 * r));
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}