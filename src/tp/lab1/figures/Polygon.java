package tp.lab1.figures;

import java.awt.*;

import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

/**
 * @author KKV
 * @version 1.0
 * @created 21-Feb-2018 4:59:11 PM
 */
public class Polygon extends Figure2D {

	protected List<Point> vertex;

	protected int numberOfVertex;

	public Polygon(Color pouringColor) {
		super(pouringColor);
	}

	public int getNumberOfVertex() {
		return numberOfVertex;
	}

	public void setNumberOfVertex(int numberOfVertex) {
		this.numberOfVertex = numberOfVertex;
		this.numberOfPointsToPaint = numberOfVertex;
	}

	@Override
	public void setProvidedPoints(List<Point> points) {
        if (points.size() != numberOfPointsToPaint) {
            throw new RuntimeException("Invalid amount of points provided");
        } else {
            setVertex(points);
        }
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

    @Override
    public void draw(Graphics2D graphics2D) {
		java.awt.Polygon polygon = new java.awt.Polygon();

		for (Point point : vertex) {
			polygon.addPoint(point.x, point.y);
		}
		polygon.addPoint(vertex.get(0).x, vertex.get(0).y);

        graphics2D.draw(polygon);
		graphics2D.setColor(pouringColor);
		graphics2D.fillPolygon(polygon);
//
//		GeneralPath path = new GeneralPath();
//
//        path.moveTo(vertex.get(0).getX(), vertex.get(0).getY());
//        for (int i = 1; i < vertex.size(); i++){
//            path.lineTo(vertex.get(i).getX(), vertex.get(i).getY());
//        }
//        path.closePath();
//        graphics2D.draw(path);
    }

    @Override
    public void move() {
        for (Point point : vertex) {
            point.move(point.x + 50, point.y);
        }
    }

    public List<Point> getVertex() {
		return vertex;
	}

	public void setVertex(List<Point> vertex) {
		this.vertex = new ArrayList<>(vertex);
	}
}