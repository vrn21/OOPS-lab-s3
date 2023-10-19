import java.util.Scanner;

class Employee{
    int Emp_id;
    String Emp_name;
    int Emp_age;
    char Emp_gender;
    String Emp_designation;
    int Emp_salary;
    String Emp_address;
    Employee(int id, String name, int age, char gender, String desig, int salary, String addr ){
        Emp_address = addr;
        Emp_age = age;
        Emp_designation = desig;
        Emp_gender = gender;
        Emp_name = name;
        Emp_salary = salary;
        Emp_id = id;
    }
}



public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees");
        int n = sc.nextInt();
        Employee[] employees; 
        employees = new Employee[n];
        for(int i = 0; i<n; i++){
            System.out.println(employees);
            employees[i] =  new Employee(23+i,"Joseph", 20, 'm', "CMO",50000,"Kochi");

        }
        System.out.println("The details of Employees are ->");
        System.out.println("ID \t Name \t Age \t Gender \t Designation \t Salary \t Address");
         for(int i = 0; i<n; i++){
            System.out.println(employees[i].Emp_id+" "+ employees[i].Emp_name+ " " + employees[i].Emp_age + " " +employees[i].Emp_gender+ " " +employees[i].Emp_designation + " " + employees[i].Emp_salary +" " + employees[i].Emp_address );
        }
        System.out.println("Enter id to search for");
        int x = sc.nextInt();
        int c = 0;
        for(int i = 0; i<n; i++){
            if (x == employees[i].Emp_id){
                System.out.println("Found!");
                System.out.println(employees[i].Emp_id+" "+ employees[i].Emp_name+ " " + employees[i].Emp_age + " " +employees[i].Emp_gender+ " " +employees[i].Emp_designation + " " + employees[i].Emp_salary +" " + employees[i].Emp_address );
                c = 1;
            }
        }
        if (c == 0){System.out.println("Not found!");}
    }
    

}
