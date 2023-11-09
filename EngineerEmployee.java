class Employee {
    float salary = 1000;
}


class Engineer extends Employee{
    float salary = 2000;
}


public class EngineerEmployee {
    public static void main(String[] args) {
        Engineer E = new Engineer();
        System.out.println("The salary of Engineer is " + this.E.salary);
        System.out.println("The salary of Engineer is " + super.E.salary);

    }
}