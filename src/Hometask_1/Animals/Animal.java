package Hometask_1.Animals;

public class Animal {
    private String name;
    private int speed;
    private int age;

    public Animal(String n, int s, int a) {
        this.name = n;
        this.speed = s;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

}

