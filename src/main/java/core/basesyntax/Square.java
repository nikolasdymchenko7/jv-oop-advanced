package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: square, area: " + calculateArea()
                + " sq. units, side: " + side + "units, color: " + getColor()));
    }
}
