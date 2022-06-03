package Hometask_1.Rectangles;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println(String.format("Площа прямокутника = %d, Периметр прямокутника = %d", rectangle.square(), rectangle.perimeter()));

        Rectangle rectangle1 = new Rectangle(25, 30);
        System.out.println(String.format("Площа прямокутника = %d, Периметр прямокутника = %d", rectangle1.square(), rectangle1.perimeter()));

    }
    
}
