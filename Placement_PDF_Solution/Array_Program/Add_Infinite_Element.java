import java.util.Scanner;

class Add_Infinite_Element{
  public static void main(String[] args) {
    
      Scanner sc=new Scanner(System.in);

      int sum=0,arr_ele=0;

      while (true) {
         
           System.err.println("Enter Array Element (-1 Break)");
           arr_ele=sc.nextInt();

           if(arr_ele==-1){
               System.out.println("Sum Is : "+sum);
               break;
           }else{
               sum+=arr_ele;
           }
      }
    
  }
}