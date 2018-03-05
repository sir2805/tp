package tp.lab1.figures;

import java.awt.*;

/**
 * @author PC
 * @version 1.0
 * @created 04-Mar-2018 7:32:48 PM
 */
public class RegularPolygon extends SymmetricPolygon {

	public RegularPolygon(){
		numberOfPointsToPaint = 2;
	}

    @Override
    public void setNumberOfVertex(int numberOfVertex) {
        this.numberOfVertex = numberOfVertex;
    }

    public void finalize() throws Throwable {
		super.finalize();
	}

	protected void setMissingVertex() {
		Point p1 = vertex.get(0);

		double x = centerPoint.getX();
		double y = centerPoint.getY();

		double r = centerPoint.distance(p1);
		vertex.clear();

		double theta = 2 * Math.PI / numberOfVertex;
		for (int i = 0; i < numberOfVertex; ++i) {
			int x_new = (int) (x + r * Math.cos(theta * i));
			int y_new = (int) (y + r * Math.sin(theta * i));
			vertex.add(new Point(x_new, y_new));
		}
	}

    @Override
    public void draw(Graphics2D graphics2D) {
        setMissingVertex();
        super.draw(graphics2D);
    }
}