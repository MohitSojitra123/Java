// OOPJ Assignment-4 (Unit-2): Array of Objects

// Write a Java program to create a class Student with private fields:
// Student
// +name: String
// +enr: int
// +fees: double
// +university: String
// +static totalFees:double
// +Student(name,enr,fees,uni):Constructor
// +void displayStudentData()
// +static double calculateTotalFees(Student[ ] s)


import java.util.Scanner;

class Student{
   
    private   String name;
   private  int enr;
   private   double fees;
   private   String university;
   static double totalfees;

     Student(String name,int enr,double fees,String uni){
           this.name=name;
           this.enr=enr;
           this.fees=fees;
           this.university=uni;
     }

     void displayStudentData(){
           System.out.println("Student Name => "+this.name);
           System.out.println("Student Enrollment Number => "+this.enr);
           System.out.println("Student Fees => "+this.fees);
           System.out.println("Student  University => "+this.university);
     }

     static double calculateTotalFees(Student[ ] s){
        for(int i=0; i<s.length; i++){
              totalfees+=s[i].fees;          
         }
         return totalfees;
     }
}


public class Assignment_4 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

     String name;
      int enr;
      double fees;
       String university;
   
          

          System.out.println("Enter Object Size....");
           int object_size=sc.nextInt();
           sc.nextLine();
           System.out.println("--------------------------------------");

           Student st[]=new Student[object_size];

           for(int i=0; i<object_size; i++){
              System.out.println("Enter Student Name => ");
              name=sc.nextLine();
              System.out.println("Enter Enrollment Number => ");
              enr=sc.nextInt();
              System.out.println("Enter Fees =>");
              fees=sc.nextDouble();
              sc.nextLine();
              System.out.println("Enter University => ");
              university=sc.nextLine();
              st[i]=new Student(name, enr, fees, university);
              System.out.println("------------------------------------");
           }

           for(int i=0; i<object_size; i++){
               st[i].displayStudentData();
               System.out.println("-----------------------------------");
           }

           System.out.println("--------------- Calculate Total Fees  -------------");
           System.out.println(Student.calculateTotalFees(st));
           System.out.println("-----------------------------------------------");


    }
}
