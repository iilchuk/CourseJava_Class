package Hometask_1.Circles;

public class Circle {

    public double radius;
    public double diameter;

    //without params:
    public Circle() {
        this.radius = 10;
        this.diameter = 2 * this.radius;
    }

    //custom with params:
    public Circle(double radius) {
        this.radius = radius;
        this.diameter = 2 * radius;
    }

    //Length:
    public double circuit() {
        return (2 * Math.PI * this.radius);
    }

    //Area:
    public double square() {
        return (Math.PI * Math.pow((diameter / 2), 2));
    }

}
