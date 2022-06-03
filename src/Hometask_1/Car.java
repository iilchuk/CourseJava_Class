package Hometask_1;

public class Car {

    private String ingineType;
    private String color;
    private Helm helm;
    private Wheel wheel;
    private Body body;

    public Car(String c, String iType, Helm h, Wheel w, Body b) {
        this.color = c;
        this.ingineType = iType;
        this.helm = h;
        this.wheel = w;
        this.body = b;
    }

    @Override
    public String toString() {
        return this.color + "/" + this.ingineType + this.helm + this.wheel + this.body;
    }

    public String getIngineType() {
        return ingineType;
    }

    public void setIngineType(String type) {
        this.ingineType = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm h) {
        this.helm = h;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel w) {
        this.wheel = w;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body b) {
        this.body = b;
    }

    public static void main(String[] args) {

        Helm helm = new Helm();
        helm.setDiameter(25);

        Wheel wheel = new Wheel();
        wheel.setRadius(15);
        wheel.setWidth(20);

        Body body = new Body();
        body.setHeight(120);
        body.setLength(450);
        body.setWidth(130);

        Car car = new Car("black", "electric", helm, wheel, body);

        String str = car.toString();
        System.out.println(str);
    }
}

class Helm {

    private int diameter;

    @Override
    public String toString() {
        return "/HELM/D:" + String.valueOf(this.diameter);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int d) {
        diameter = d;
    }

}

class Wheel {

    private int width;
    private int radius;

    public void ChangeWheelRadius(int n) {
        this.radius = this.radius * n;
    }

    @Override
    public String toString() {
        return "/Wheel/W:" + String.valueOf(this.width) + "/R:" + String.valueOf(this.radius);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int w) {
        width = w;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }

}

class Body {

    private int width;
    private int length;
    private int height;

    @Override
    public String toString() {
        return "/Body/W:" + String.valueOf(this.width) + "/L:" + String.valueOf(this.length) + "/H:" + String.valueOf(this.height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int w) {
        width = w;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int l) {
        length = l;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        height = h;
    }

}

