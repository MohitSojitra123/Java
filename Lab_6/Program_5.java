// Write a Java program to create a class called Employee with a name, job title, and salary
// attributes, and methods to calculate and update salary.

import java.util.Scanner;

class Employee{
      
        String name,job,title;
        int salary;


      public void setter(){
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter Employee Name => ");
            this.name=sc.nextLine();

            System.out.println("Enter Job Role => ");
            this.job=sc.nextLine();

            System.out.println("Enter Title => ");
            this.title=sc.nextLine();

            System.out.println("Enter Employe Salary => ");
            this.salary=sc.nextInt();
      } 

      public void getter(){
           System.out.println("Employee Name => "+name);
           System.out.println("Employe job Name => "+job);
           System.out.println("Employe Title => "+title);
           System.out.println("Employee Salary => "+salary);
      }

      public void salary_calculation(){
            System.out.println("Total 12 Month Salary => "+(salary*12));
      }

      public void salary_update(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Current Salary Is "+salary);
        System.out.println("Enter Updated Salary ");
        this.salary=sc.nextInt();
      }

}

public class Program_5 {
      public static void main(String[] args) {
            
              Employee emp=new Employee();

              emp.setter();
              System.out.println("-----------------------------");
              emp.getter();
              System.out.println("-----------------------------");
               emp.salary_calculation();
              System.out.println("-----------------------------");
              emp.salary_update();
              System.out.println("-----------------------------");
               emp.getter();
              System.out.println("-----------------------------");

      }
}
