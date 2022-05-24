package Hometask_1;

import java.util.Scanner;

public class Rectangle {

    public int length;
    public int width;

    //Без параметрів:
    public Rectangle(){
        this.length = 10;
        this.width = 15;
    }

    //Кастомний з параметрами:
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    //Периметр:
    public int perimeter(){
        return (2*(this.length + this.width));
    }

    //Площа:
    public int square(){
        return (this.length * this.width);
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println(String.format("Площа прямокутника = %d, Периметр прямокутника = %d", rectangle.square(), rectangle.perimeter()));

        Rectangle rectangle1 = new Rectangle(25, 30);
        System.out.println(String.format("Площа прямокутника = %d, Периметр прямокутника = %d", rectangle1.square(), rectangle1.perimeter()));

    }
}

