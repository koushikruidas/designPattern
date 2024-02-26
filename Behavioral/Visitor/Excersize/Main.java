package Pattern.Behavioral.Visitor.Excersize;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * In the previous lecture we have seen how to implement the visitor pattern.
 * In this exercise your task is to create an application that can save the given geometric shapes.
 * So there are 3 classes - all of the are Shapes:
 *
 * Circle
 * Rectangle
 * Triangle
 *
 * These are the shapes we want to visit with the visitor pattern and save the shapes one by one!
 *
 * Good luck!
 */

public class Main {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(10));
        shapeList.add(new Triangle(10,15));
        shapeList.add(new Rectangle(10,20));
        ShapeSaver saver = new ShapeSaver();
        for (Shape shape : shapeList){
            shape.accept(saver);
        }
    }
}
