package Pattern.Behavioral.Visitor.Excersize;

public class ShapeSaver implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        circle.save();
    }

    @Override
    public void visit(Triangle triangle) {
        triangle.save();
    }

    @Override
    public void visit(Rectangle rectangle) {
        rectangle.save();
    }
}
