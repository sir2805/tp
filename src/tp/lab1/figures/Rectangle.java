package tp.lab1.figures;

import java.awt.*;

/**
 * @author KKV
 * @version 1.0
 * @created 21-Feb-2018 4:59:12 PM
 */
public class Rectangle extends SymmetricPolygon {

    public Rectangle(Color pouringColor) {
        super(pouringColor);
        this.numberOfVertex = 4;
        this.numberOfPointsToPaint = 2;
    }

    public void finalize() throws Throwable {
		super.finalize();
	}

	protected void setMissingVertex() {
        Point p1 = vertex.get(0);

        int x = (int) centerPoint.getX();
        int y = (int) centerPoint.getY();

        int delta_x = (int) Math.abs(x - p1.getX());
        int delta_y = (int) Math.abs(y - p1.getY());

        vertex.set(0, new Point(x - delta_x, y - delta_y));
        vertex.add(new Point(x + delta_x, y - delta_y));
        vertex.add(new Point(x + delta_x, y + delta_y));
        vertex.add(new Point(x - delta_x, y + delta_y));
	}

    @Override
    public void draw(Graphics2D graphics2D) {
	    setMissingVertex();
        super.draw(graphics2D);
    }
}