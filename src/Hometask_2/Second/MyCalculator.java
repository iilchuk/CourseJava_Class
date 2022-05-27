package Hometask_2.Second;

import Hometask_2.First.Numerable;

public class MyCalculator implements Numerable {

    public int a;
    public int b;

    @Override
    public void plus() {
        System.out.println(a+b);
    }

    @Override
    public void minus() {
        System.out.println(a-b);
    }

    @Override
    public void multiply() {
        System.out.println(a*b);
    }

    @Override
    public void divide() {
        System.out.println(a/b);
    }

}

class Main {

    public static void main(String[] args) {

        MyCalculator myCalculator = new MyCalculator();

        myCalculator.a = 100;
        myCalculator.b = 20;

        myCalculator.plus();
        myCalculator.minus();
        myCalculator.multiply();
        myCalculator.divide();

    }

}