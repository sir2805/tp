package tp.lab1.figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.List;

/**
 * @author KKV
 * @version 1.0
 * @created 21-Feb-2018 4:59:11 PM
 */
public class Ellipse extends Figure2D {

	protected Point firstPoint;

	public Ellipse(Color pouringColor) {
		super(pouringColor);
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

	public void finalize() throws Throwable {
		super.finalize();
	}

    @Override
    public void draw(Graphics2D graphics2D) {
        Point p1 = firstPoint;

        double c = Math.abs(centerPoint.getX() - p1.getX());
        double p = Math.abs(centerPoint.getY() - p1.getY());

        double e = (c == 0.0)?0:(Math.sqrt(p*p/c/c + 4) - p/c)/2;

        double a = (e == 0.0)? p:c / e;
        double b = a*Math.sqrt(1 - e*e);

        Ellipse2D ellipse2D = new Ellipse2D.Double(centerPoint.getX() - a,
                centerPoint.getY() - b, 2 * a,2 * b);

        graphics2D.draw(ellipse2D);
        graphics2D.setColor(pouringColor);
        graphics2D.fill(ellipse2D);
    }

	public Point getFirstPoint(){
		return null;
	}

	public void setFirstPoint(){

	}
}