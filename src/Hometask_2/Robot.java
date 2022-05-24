package Hometask_2;

import java.util.Arrays;

public class Robot {
    public void work(){
        System.out.println("Я Robot – я просто працюю");
    }

    public static void main(String[] args) {
        CoffeRobot coffeRobot = new CoffeRobot();
        coffeRobot.work();

        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();

        RobotCoocker robotCoocker = new RobotCoocker();
        robotCoocker.work();

        //массив
        Robot[] robots = {coffeRobot, robotDancer, robotCoocker};
        for (int i = 0; i < robots.length; i++) {
            robots[i].work();
        }
    }
}

class CoffeRobot extends Robot{
    public void work(){
        System.out.println("Я CoffeRobot – я варю каву");
    }
}

class RobotDancer extends Robot{
    public void work(){
        System.out.println("Я RobotDancer – я просто танцюю");
    }
}

class RobotCoocker extends Robot{
    public void work(){
        System.out.println("Я RobotCoocker – я просто готую");
    }
}

