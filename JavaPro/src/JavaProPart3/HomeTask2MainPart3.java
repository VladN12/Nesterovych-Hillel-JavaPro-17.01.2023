package JavaProPart3;

public class HomeTask2MainPart3 {
    private static void totalArea(double[] arrayOfShapesTwo) {
        double counter = 0.0;
        for (double arrayOfShape : arrayOfShapesTwo) {
            counter = counter + arrayOfShape;
        }
        System.out.print("Total area of all figures are " + counter + ".");
    }

    public static void main(String[] args) {
        double[] arrayOfShapes = new double[3];
        Circle circle = new Circle(12);
        arrayOfShapes[0] = circle.countArea();
        Square square = new Square(10);
        arrayOfShapes[1] = square.countArea();
        Triangle triangle = new Triangle(12, 10);
        arrayOfShapes[2] = triangle.countArea();
        totalArea(arrayOfShapes);
    }
}
