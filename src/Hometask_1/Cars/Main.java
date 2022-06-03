package Hometask_1.Cars;

public class Main {

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
