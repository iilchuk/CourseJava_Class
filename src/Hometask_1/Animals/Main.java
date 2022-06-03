package Hometask_1.Animals;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Сапсан", 320, 15);

        System.out.println("Назва тварини : " + animal.getName() + ", Швидкість тварини: " + animal.getSpeed() + " км/год" + ", Вік тварини: " + animal.getAge());
        System.out.println("-------------------------------------------------------------------------------");

        animal.setName("Гепард");
        animal.setAge(5);
        animal.setSpeed(110);

        System.out.println("Назва тварини : " + animal.getName() + ", Швидкість тварини: " + animal.getSpeed() + " км/год" + ", Вік тварини: " + animal.getAge());

    }
    
}
