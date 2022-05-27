package Hometask_2;

import Hometask_1.Robot;

public class Flower {

    private String color;
    private int price;

    public String getColor(){
        return color;
    }

    public void setColor(String c){
        color = c;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int p){
        price = p;
    }

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

        //массив
        Flower[] flowers = {flower1, flower2, flower3};

        int sum = 0;

        for (int i = 0; i < flowers.length; i++) {
            sum = sum + flowers[i].price;
        }

        System.out.println(sum);
    }

}

class Flower1 extends Flower {

}

class Flower2 extends Flower {

}

class Flower3 extends Flower {

}