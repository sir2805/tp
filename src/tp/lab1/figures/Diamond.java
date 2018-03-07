package tp.lab1.figures;

import java.awt.*;

/**
 * @author KKV
 * @version 1.0
 * @created 21-Feb-2018 4:59:11 PM
 */
public class Diamond extends SymmetricPolygon {

	public Diamond(Color pouringColor) {
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

            int x = (int) centerPoint.getX();
            int y = (int) centerPoint.getY();

            int delta_x = (int) Math.abs(x - p1.getX());
            int delta_y = (int) Math.abs(y - p1.getY());

            vertex.set(0, new Point(x, y - delta_y));
            vertex.add(new Point(x + delta_x, y));
            vertex.add(new Point(x, y + delta_y));
            vertex.add(new Point(x - delta_x, y));
        }
	}

	@Override
	public void draw(Graphics2D graphics2D) {
		setMissingVertex();
		super.draw(graphics2D);
	}
}