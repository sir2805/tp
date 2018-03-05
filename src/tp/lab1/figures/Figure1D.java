package tp.lab1.figures;

import java.awt.*;
import java.util.List;

/**
 * @version 1.0
 * @created 21-Feb-2018 4:59:11 PM
 */
public abstract class Figure1D extends Figure {

	protected Color lineColor;
	protected Point secondPoint;

	public Figure1D(){
		this.numberOfPointsToPaint = 2;
	}

	@Override
	public void setProvidedPoints(List<Point> points) {
		if (points.size() != numberOfPointsToPaint) {
			throw new RuntimeException("Invalid amount of points provided");
		} else {
			centerPoint = points.get(0);
			secondPoint = points.get(1);
		}
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Color getLineColor() {
		return lineColor;
	}

	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}

	public Point getSecondPoint() {
		return secondPoint;
	}

	public void setSecondPoint(Point secondPoint) {
		this.secondPoint = secondPoint;
	}
}