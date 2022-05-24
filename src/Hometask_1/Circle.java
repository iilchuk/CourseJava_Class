package Hometask_1;

public class Circle {

    public double radius;
    public double diameter;

    //Без параметрів:
    public Circle(){
        this.radius = 10;
        this.diameter = 2*this.radius;
    }

    //Кастомний з параметрами:
    public Circle(double radius){
        this.radius = radius;
        this.diameter = 2*radius;
    }

    //Довжина:
    public double circuit(){
        return (2*3.14159*this.radius);
    }

    //Площа:
    public double square(){
        return (3.14159*Math.pow((diameter/2), 2));
    }

    public static void main(String[] args) {

        Circle сircle = new Circle();
        System.out.println(String.format("Площа кола = %f, Довжина кола = %f", сircle.square(), сircle.circuit()));

        Circle сircle1 = new Circle(15);
        System.out.println(String.format("Площа кола = %f, Довжина кола = %f", сircle1.square(), сircle1.circuit()));

    }

}
