// Create class Employee_Detail with attributes Employee_ID, Name, Designation,
// and Salary. Write a program to read the detail from user and print it.

import java.util.Scanner;

class Employee_Detail{
    int Employee_ID;
    String Name;
    String Designation;
    int Salary;
    public Employee_Detail(){
        Employee_ID=0;
        Name="";
        Designation="";
        Salary=0;
    }
    public void getData(){
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employee ID : ");
        Employee_ID = scanner.nextInt();
        System.out.println("Enter the name of the Employee : ");
        Name = sc.nextLine();
        System.out.println("Enter the Designation of the Employee : ");
        Designation = sc.nextLine();
        System.out.println("Enter the Salary of the Employee : ");
        Salary = scanner.nextInt();
    }
    public void printData(){
        System.out.println("Employee ID : "+Employee_ID);
        System.out.println("Name of the Employee : "+Name);
        System.out.println("Designation of the Employee : "+Designation);
        System.out.println("Salary of the Employee : "+Salary);
    }
} 
public class DS_LAB_34 {
    public static void main(String[] args) {
        Employee_Detail emp = new Employee_Detail();
        emp.getData();
        emp.printData();
    }
}
