package tp.lab1.figures;

import java.awt.*;

import java.util.List;

/**
 * @version 1.0
 * @created 21-Feb-2018 4:59:11 PM
 */
public abstract class Figure {

	protected Point centerPoint;

	protected int numberOfPointsToPaint;

	public Figure(){

        this.numberOfPointsToPaint = 1;
    }

	public abstract void setProvidedPoints(List<Point> points);

	public void finalize() throws Throwable {

	}

	public int getNumberOfPointsToPaint() {
		return numberOfPointsToPaint;
	}

	public abstract void draw(Graphics2D graphics2D);

	public Point getCenterPoint() {
		return centerPoint;
	}

	public void setCenterPoint(Point centerPoint) {
		this.centerPoint = centerPoint;
	}

	public Point location(){
		return centerPoint;
	}

	public void move(){

	}

}