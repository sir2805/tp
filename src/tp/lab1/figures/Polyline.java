package tp.lab1.figures;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author KKV
 * @version 1.0
 * @created 21-Feb-2018 4:59:11 PM
 */
public class Polyline extends Figure {

	private List<Segment> segments = new ArrayList<>();

	private Color lineColor;

	private int numberOfSegments;

	public Polyline(Color lineColor) {
        this.lineColor = lineColor;
	}

    @Override
    public void setProvidedPoints(List<Point> points) {
	    segments.clear();
        for (int i = 0; i < points.size() - 1; i++) {
            Segment segment = new Segment(lineColor);
            segment.setCenterPoint(points.get(i));
            segment.setSecondPoint(points.get(i + 1));
            segments.add(segment);
        }
    }

    public void finalize() throws Throwable {

	}

	@Override
	public void draw(Graphics2D graphics2D) {
        for (Segment segment : segments) {
            segment.draw(graphics2D);
        }
	}

    @Override
    public void move() {
        for (Segment segment : segments) {
            segment.move();
        }
    }

    public List<Segment> getSegments() {
		return segments;
	}

	public void setSegments(List<Segment> segments) {
		this.segments = segments;
	}

    public int getNumberOfSegments() {
        return numberOfSegments;
    }

    public void setNumberOfSegments(int numberOfSegments) {
        this.numberOfSegments = numberOfSegments;
        this.numberOfPointsToPaint = numberOfSegments + 1;
    }
}