package Hometask_1.Rectangles;

public class Rectangle {

    public int length;
    public int width;

    //without params:
    public Rectangle() {
        this.length = 10;
        this.width = 15;
    }

    //custom with params:
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //perimeter:
    public int perimeter() {
        return (2 * (this.length + this.width));
    }

    //area:
    public int square() {
        return (this.length * this.width);
    }

}

