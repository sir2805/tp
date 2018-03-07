package tp.lab1.figures;

import java.awt.*;
import java.util.List;

/**
 * @author KKV
 * @version 1.0
 * @created 21-Feb-2018 4:59:11 PM
 */
public class Line extends Ray {

	public Line(){
        this.numberOfPointsToPaint = 2;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

    @Override
    public void draw(Graphics2D graphics2D) {
		super.draw(graphics2D);

		Point temp = centerPoint;
        centerPoint = secondPoint;
        secondPoint = temp;

        super.draw(graphics2D);
    }
}