class Employee{
 
 String name;
 int age;
 String phNo;
 String Addre;
 int salary;

 void print_salary(){
    System.out.println("Salary of "+ name + "is : " + salary);
 }


}

class Officer extends Employee{
    String Specialisation;
    Officer(String name,int age,String phNo,String Addre,int salary,String spec){
        this.name = name;
        this.age = age;
        this.phNo = phNo;
        this.Addre = Addre;
        this.salary = salary;
        Specialisation = spec;
        
    }

}

class Manager extends Employee{
    String Department;
    Manager(String name,int age,String phNo,String Addre,int salary,String department){
        this.name = name;
        this.age = age;
        this.phNo = phNo;
        this.Addre = Addre;
        this.salary = salary;
        Department = department;
        
    }
}

class Employees2{
    public static void main(String arg[]){
        Manager m1 = new Manager("Amrithesh",20,"68465465","MH MEC",69000,"DCS");
        Officer o1 = new Officer("Ashwin",200,"65465469","Ernamkulam",696969,"git");
        System.out.println(m1.name + " " + m1.age + " " + m1.phNo + " " + m1.Addre + "  " + m1.salary + " " + m1.Department);
        System.out.println(o1.name + " " + o1.age + " " + o1.phNo + " " + o1.Addre + "  " + o1.salary + " " + o1.Specialisation);
        m1.print_salary();
        o1.print_salary();
    }
}