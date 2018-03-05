package tp.lab1.figures;

import static tp.lab1.util.Constants.*;


public class FigureFactory {

    public static Figure createFigure(String figureName) {
        switch (figureName) {
            case CIRCLE:
                return new Circle();
            case DIAMOND:
                return new Diamond();
            case ELLIPSE:
                return new Ellipse();
            case LINE:
                return new Line();
            case POLYGON:
                return new Polygon();
            case POLYLINE:
                return new Polyline();
            case RAY:
                return new Ray();
            case RECTANGLE:
                return new Rectangle();
            case REGULAR_POLYGON:
                return new RegularPolygon();
            case SEGMENT:
                return new Segment();
            default:
                return null;
        }
    }
}
