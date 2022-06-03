package Hometask_2.Flowers;

public class Main {

    public static void main(String[] args) {

        Flower1 flower1 = new Flower1();
        Flower2 flower2 = new Flower2();
        Flower3 flower3 = new Flower3();

        flower1.setColor("yellow");
        flower2.setColor("red");
        flower3.setColor("purple");

        flower1.setPrice(15);
        flower2.setPrice(45);
        flower3.setPrice(20);

        //array
        Flower[] flowers = {flower1, flower2, flower3};

        int sum = 0;

        for (int i = 0; i < flowers.length; i++) {
            sum = sum + flowers[i].getPrice();
        }

        System.out.println(sum);
    }

}