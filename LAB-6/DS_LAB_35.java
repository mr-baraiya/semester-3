// Create array of object of class Student_Detail with attributes Enrollment_No,
// Name, Semester, CPI for 5 students, scan their information and print it.

import java.util.Scanner;
class Student_Detail{
    int Enrollment_No;
    String Name;
    int Semester;
    double CPI;
    public Student_Detail(){
        this.Enrollment_No= 0;
        this.Name= "";
        this.Semester= 0;
        this.CPI= 0.0;
    }
    public void getInfo(){
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Enrollment Number of the Student : ");
        Enrollment_No = scanner.nextInt();
        System.out.println("Enter the Name of the Student : ");
        Name = sc.next();
        System.out.println("Enter the Semester of the Student : ");
        Semester = scanner.nextInt();
        System.out.println("Enter the CPI of the Student : ");
        CPI = scanner.nextDouble();
    }
    public void printInfo(){
        System.out.println("Enrollment Number : "+ Enrollment_No);
        System.out.println("Name : "+ Name);
        System.out.println("Semester : "+ Semester);
        System.out.println("CPI : "+ CPI);
    }
}
public class DS_LAB_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_Detail[] s = new Student_Detail[5];
        for(int i=0;i<5;i++){
            s[i] = new Student_Detail();
            s[i].getInfo();
        }
        for(int i=0;i<5;i++){
            s[i].printInfo();
        }
    }
} 
