public class Triangle {

    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double Perimetr() {
        return side1 + side2 + side3;
    }

    public double Area() {
        double halfPerimetr = Perimetr() / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr - side1) * (halfPerimetr - side2) * (halfPerimetr - side3));
    }
}
