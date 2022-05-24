package Hometask_2;

public class Animal {
    private String name;
    private int speed;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int s){
        speed = s;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public Animal(String n, int s, int a){
        this.name = n;
        this.speed = s;
        this.age = a;
    }


    public static void main(String[] args) {

        Animal animal = new Animal("Сапсан",320, 15);

        System.out.println("Назва тварини : "+animal.getName()+", Швидкість тварини: "+animal.getSpeed()+" км/год"+", Вік тварини: "+animal.getAge());
        System.out.println("-------------------------------------------------------------------------------");

        animal.setName("Гепард");
        animal.setAge(5);
        animal.setSpeed(110);

        System.out.println("Назва тварини : "+animal.getName()+", Швидкість тварини: "+animal.getSpeed()+" км/год"+", Вік тварини: "+animal.getAge());

    }
}

