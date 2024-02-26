package Pattern.Behavioral.Visitor.Excersize;

public class Circle implements Shape {
    private double pi = Math.PI;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }

    public void save(){
        System.out.println("saving circle with area: "+pi*radius*radius);
    }
}
