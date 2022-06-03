package Hometask_2.Calculator.Second;

import Hometask_2.Calculator.First.Numerable;

public class MyCalculator implements Numerable {

    public int a;
    public int b;

    @Override
    public void plus() {
        System.out.println(a + b);
    }

    @Override
    public void minus() {
        System.out.println(a - b);
    }

    @Override
    public void multiply() {
        System.out.println(a * b);
    }

    @Override
    public void divide() {
        System.out.println(a / b);
    }

}
