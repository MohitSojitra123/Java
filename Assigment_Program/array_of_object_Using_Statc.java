import java.util.Scanner;

class emp{
    
    String name;
    int salary;

     emp(String name,int salary){
             this.name=name;
             this.salary=salary;
     }

     void show(){
        System.out.println("Employee Name => "+name);
        System.out.println("Employee Salary => "+salary);
        System.out.println("-------------------------------");
     }

     static void total_salary(emp all_salary[]){
         int total=0;
        
        for(int i=0; i<all_salary.length; i++){
             total+=all_salary[i].salary;
          }

          System.out.println("--------------------------------");
          System.out.println("Total Salary => "+total);
          System.out.println("--------------------------------");
     }

}



public class array_of_object_Using_Statc {
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
         

          System.out.println("Enter Object Size => ");
          int object_size=sc.nextInt();


             emp emps[]=new emp[object_size];

               String Emp_name;
               int Emp_salary; 

             for(int i=0; i<object_size; i++){
                   System.out.println("Enter Employe Name => ");
                   Emp_name=sc.nextLine();
                   System.out.println("Enter Employe Salary => ");
                   Emp_salary=sc.nextInt();
                   sc.nextLine();

                   emps[i]=new emp(Emp_name, Emp_salary);    
             }

             for(int i=0; i<object_size; i++){
                emps[i].show();
             }

             emp.total_salary(emps);


        
     }
}
