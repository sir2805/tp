package tp.lab1.figures;

import java.awt.*;

import static tp.lab1.util.Constants.*;


public class FigureFactory {

    public static Figure createFigure(String figureName, Color currentColor) {
        switch (figureName) {
            case CIRCLE:
                return new Circle(currentColor);
            case DIAMOND:
                return new Diamond(currentColor);
            case ELLIPSE:
                return new Ellipse(currentColor);
            case LINE:
                return new Line(currentColor);
            case POLYGON:
                return new Polygon(currentColor);
            case POLYLINE:
                return new Polyline(currentColor);
            case RAY:
                return new Ray(currentColor);
            case RECTANGLE:
                return new Rectangle(currentColor);
            case REGULAR_POLYGON:
                return new RegularPolygon(currentColor);
            case SEGMENT:
                return new Segment(currentColor);
            default:
                return null;
        }
    }
}
