import java.util.Scanner;

public class Array_Question {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter Array Size....");
      int array_size=sc.nextInt();

       int array[]=new int[array_size];

    for(int i=0; i<array_size; i++){
        System.out.println("Enter Array Element....");
        array[i]=sc.nextInt();
    }

    Array_Question aq=new Array_Question();
  
      System.out.println("---------------------------------------");
      System.out.println("Sum Of Array Element Is "+aq.sum_array(array));
      System.out.println("---------------------------------------");
      System.out.println("Sum Of Array Element Is "+aq.mul_array(array));
      System.out.println("---------------------------------------");
      System.out.println("Revese Array");
      
      int revese_array[]=new int[array.length];
      revese_array=aq.revese_array(array);
       for(int ele : revese_array){
        System.out.print(ele+"  ");
       }
       System.out.println();
      System.out.println("---------------------------------------");
         System.out.println("Avg... Of Array Element Is "+aq.avg_array(array));
      System.out.println("---------------------------------------");
         System.out.println("Largest  Element of Array "+aq.largest_element(array));
      System.out.println("---------------------------------------");
         System.out.println("Smallest Element Of Array "+aq.Smallest_element(array));
      System.out.println("---------------------------------------");
      System.out.println("Sorted Array");

       int sorted_array[]=new int[array.length];
       sorted_array=aq.sorted_array(revese_array);

       for(int ele : sorted_array){
        System.out.print(ele+"  ");
       }
        System.out.println();
      System.out.println("---------------------------------------");


   }

//    Sum Of all Array Element
      public int sum_array(int array[]){
          int sum=0;
        for(int i=0; i<array.length; i++){
           sum+=array[i];         
        }
        return sum;
      }
//    Sum Of all Array Element

// Multiply Of all Array Element 
      public int mul_array(int array[]){
          int mul=1;
        for(int i=0; i<array.length; i++){
           mul*=array[i];         
        }
        return mul;
      }
// Multiply Of all Array Element 

// Reverse Array
   public int[] revese_array(int array[]){
        int array_revese[]=new int[array.length];
        int count=0;
       for(int i=array.length-1; i>=0; i--){
              array_revese[count]=array[i];
              count++;
       }
       return array_revese;
   }
// Reverse Array

// Average Of Array Element
public float avg_array(int array[]){
     float avg=0;
     int sum=0;

     for(int i=0; i<array.length; i++){
          sum+=array[i];
     }
     avg=sum/(array.length);
     return avg;
}
// Average Of Array Element


// Large Element Of Array 
public int largest_element(int array[]){
    int largest=array[0];

    for(int i=0; i<array.length; i++){
           if(array[i] > largest){
               largest=array[i];
           }
        }
        return largest;
  }
// Large Element Of Array 

// Smallest Element Of Array 
public int Smallest_element(int array[]){
    int Smallest=array[0];

    for(int i=0; i<array.length; i++){
           if(array[i] < Smallest){
               Smallest=array[i];
           }
        }
        return Smallest;
  }
// Smallest Element Of Array 

// Sorted Array 
public int[] sorted_array(int array[]){
    int temp;
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] > array[j]){
                   temp=array[i];
                   array[i]=array[j];
                   array[j]=temp;                 
                }
            }
        }
        return array;
}
// Sorted Array 

}