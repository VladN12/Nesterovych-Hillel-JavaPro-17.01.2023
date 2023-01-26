package JavaProPart3;

public class Square implements AreaCalculation {

    private final int squareSide;

    public Square(int squareSide) {
        this.squareSide = squareSide;
    }


    @Override
    public double countArea() {

        return squareSide*squareSide;
    }
}
