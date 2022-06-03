package Hometask_2.EmployeeSalary;

public interface Salary {

    public default void salary() {
        System.out.println("Зарплата працівника");
    }

}

class EmployeeHour implements Salary {

    private int hourPrice = 25;

    @Override
    public void salary() {
        System.out.println("Працівник з погодинною зарплатою: " + hourPrice);
    }

}

class EmployeeRate implements Salary {

    private int rate = 2500;

    @Override
    public void salary() {
        System.out.println("Працівник з фіксованою місячною зарплатою: " + rate);
    }

}

