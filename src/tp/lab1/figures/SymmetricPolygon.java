package tp.lab1.figures;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author KKV
 * @version 1.0
 * @created 21-Feb-2018 4:59:12 PM
 */
public abstract class SymmetricPolygon extends Polygon {

	public SymmetricPolygon(Color pouringColor) {
		super(pouringColor);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public void move() {
		centerPoint.move(centerPoint.x + 50, centerPoint.y);
		super.move();
	}

	protected abstract void setMissingVertex();

	@Override
	public void setProvidedPoints(List<Point> points) {
        if (points.size() != numberOfPointsToPaint) {
            throw new RuntimeException("Invalid amount of points provided");
        } else {
            vertex = new ArrayList<>(points);
            centerPoint = vertex.remove(0);
        }
	}
}