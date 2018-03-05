package tp.lab1;

import tp.lab1.figures.Figure;
import tp.lab1.figures.FigureFactory;
import tp.lab1.figures.Polygon;
import tp.lab1.figures.Polyline;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import static tp.lab1.util.Constants.*;

public class DrawingApp extends JFrame {

    private Figure currentFigure;

    private List<Point> currentPoints = new ArrayList<>();

    private static final String[] FIGURE_TYPES = {SEGMENT, RAY, LINE, POLYLINE, RECTANGLE, CIRCLE, ELLIPSE, DIAMOND, POLYGON, REGULAR_POLYGON};

    public static final int CANVAS_WIDTH = 800;
    public static final int CANVAS_HEIGHT = 800;

    public DrawingApp() {
        // add check box group
        ButtonGroup cbg = new ButtonGroup();
        List<JRadioButton> buttons = new ArrayList<>();

        for (String figureType : FIGURE_TYPES) {
            JRadioButton button = new JRadioButton(figureType);
            if (figureType.equals(POLYGON) || figureType.equals(REGULAR_POLYGON)) {
                button.addActionListener(ae -> {
                    currentFigure = FigureFactory.createFigure(ae.getActionCommand());
                    System.out.println(currentFigure.getClass().toString());
                    Integer numberOfVertex = Integer.valueOf(JOptionPane.showInputDialog("Please input number of vertex"));
                    ((Polygon) currentFigure).setNumberOfVertex(numberOfVertex);
                });
            } else if (figureType.equals(POLYLINE)) {
                button.addActionListener(ae -> {
                    currentFigure = FigureFactory.createFigure(ae.getActionCommand());
                    System.out.println(currentFigure.getClass().toString());
                    Integer numberOfSegments = Integer.valueOf(JOptionPane.showInputDialog("Please input number of segments"));
                    ((Polyline) currentFigure).setNumberOfSegments(numberOfSegments);
                });
            } else {
                button.addActionListener(ae -> {
                    currentFigure = FigureFactory.createFigure(ae.getActionCommand());
                    System.out.println(currentFigure.getClass().toString());
                });
            }
            buttons.add(button);
            cbg.add(button);
        }

        buttons.get(0).setSelected(true);
        currentFigure = FigureFactory.createFigure(buttons.get(0).getText());
        System.out.println(currentFigure.getClass().toString());
        JPanel radioPanel = new JPanel(new FlowLayout());
        for (JRadioButton button : buttons) {
            radioPanel.add(button);
        }

        DrawCanvas canvas = new DrawCanvas();
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                System.out.println("clicked");
                currentPoints.add(me.getPoint());
                if (currentFigure.getNumberOfPointsToPaint() == currentPoints.size()) {
                    currentFigure.setProvidedPoints(currentPoints);
                    DrawingApp.this.repaint();
                    currentPoints.clear();
                }
            }
        });

        this.setLayout(new BorderLayout());
        this.add(radioPanel, BorderLayout.NORTH);

        this.add(canvas, BorderLayout.CENTER);

        this.pack();
        this.setTitle("Simple DRAW");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private class DrawCanvas extends JPanel {
        @Override
        protected void paintComponent(Graphics g) { // called back via repaint()
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            currentFigure.draw(g2);
        }
    }

    // The entry main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrawingApp::new);
    }
}