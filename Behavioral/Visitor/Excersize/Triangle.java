package Pattern.Behavioral.Visitor.Excersize;

public class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base){
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }

    public void save(){
        System.out.println("saving triable with area: "+(0.5) * (base * height));
    }
}
