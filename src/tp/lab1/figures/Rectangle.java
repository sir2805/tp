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
        if (numberOfVertex != vertex.size()) {
            Point p1 = vertex.get(0);

            int x = centerPoint.x;
            int y = centerPoint.y;

            int delta_x = Math.abs(x - p1.x);
            int delta_y = Math.abs(y - p1.y);

            vertex.set(0, new Point(x - delta_x, y - delta_y));
            vertex.add(new Point(x + delta_x, y - delta_y));
            vertex.add(new Point(x + delta_x, y + delta_y));
            vertex.add(new Point(x - delta_x, y + delta_y));
        }
	}

    @Override
    public void draw(Graphics2D graphics2D) {
	    setMissingVertex();
        super.draw(graphics2D);
    }
}