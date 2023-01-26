package JavaProPart3;

public class Circle implements AreaCalculation {
    private final int r;

    Circle(int radius) {
        r = radius;

    }

    @Override
    public double countArea() {

        return 3.14 * r * r;
    }


}
