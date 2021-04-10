public class Square extends Rectangle {
    private double Side;

    public double getSide() {
        return Side;
    }

    public void setSide(double side) {
        Side = side;
    }

    public Square(String color, boolean filled, double width, double height) {
        super(width, height);
    }
    public Square(double side) {
        super(side, side);
    }


    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    }


