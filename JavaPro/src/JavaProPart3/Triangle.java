package JavaProPart3;

public class Triangle implements AreaCalculation {

    private final int side;
    private final int height;

    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }


    @Override
    public double countArea() {

        return 0.5*side*height;
    }
}
