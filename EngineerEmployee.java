class Employee {
    private float salary = 1000;
    float getSalary(){
        return salary;
    }
}

class Engineer extends Employee{
    public float salary = 20000;
    float getSalary(){
        return this.salary;
    }
}

public class EngineerEmployee {
    public static void main(String[] args) {
        Engineer E = new Engineer();
        System.out.println(E.salary);
        System.out.println("The salary of Engineer is " + E.getSalary());
        System.out.println("The salary of Employee is " + ((Employee) E).getSalary());

    }
}