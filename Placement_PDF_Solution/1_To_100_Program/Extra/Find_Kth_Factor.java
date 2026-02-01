// kth Factor 
// User  Input 12 Number 
//  kth == > 1  == 1
//  kth == > 2  == 2
//  kth == > 5  == 6

// 1*12 == 12
// 2*6 == 12
// 3*4 == 12
// 4*3 == 12
// 6*2 == 12
// 12*1 == 12

package Extra;

import java.util.Scanner;


public class Find_Kth_Factor {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter Any Number : ");
          int num=sc.nextInt();

          System.out.println("Enter Kth Factor : ");
          int Kth=sc.nextInt();

           int count=0;
           int current_factor=0;

          for(int i=1; i<=num; i++){
                if(num%i==0){
                     count++;
                     current_factor=i;
                }

                if(count==Kth){
                     System.out.println("Kth Factor Is : "+current_factor);
                     count=-1;
                     break;
                }
          }

          if(count!=-1){
            System.out.println("Kth Factor Is Not Available : ");
          }


    }
}
