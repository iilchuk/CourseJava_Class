package Hometask_1.Robots;

public class Robot {
    public void work() {
        System.out.println("Я Robot – я просто працюю");
    }
}

class CoffeRobot extends Robot {
    public void work() {
        System.out.println("Я CoffeRobot – я варю каву");
    }
}

class RobotDancer extends Robot {
    public void work() {
        System.out.println("Я RobotDancer – я просто танцюю");
    }
}

class RobotCoocker extends Robot {
    public void work() {
        System.out.println("Я RobotCoocker – я просто готую");
    }
}

