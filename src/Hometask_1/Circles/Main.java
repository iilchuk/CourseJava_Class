package Hometask_1.Circles;

public class Main {

    public static void main(String[] args) {

        Circle сircle = new Circle();
        System.out.println(String.format("Площа кола = %f, Довжина кола = %f", сircle.square(), сircle.circuit()));

        Circle сircle1 = new Circle(15);
        System.out.println(String.format("Площа кола = %f, Довжина кола = %f", сircle1.square(), сircle1.circuit()));

    }

}
