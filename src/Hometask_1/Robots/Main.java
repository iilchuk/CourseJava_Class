package Hometask_1.Robots;

public class Main {

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
