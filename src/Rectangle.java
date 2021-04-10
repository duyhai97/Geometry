public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getAria(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width + height);

    }
    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");

    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
