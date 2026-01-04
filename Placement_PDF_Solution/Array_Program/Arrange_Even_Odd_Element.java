// Rearrange array such that even index has even number and odd index has odd number.

import java.util.Scanner;

public class Arrange_Even_Odd_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int array_size;

        System.out.println("Enter Array SIze : ");
        array_size=sc.nextInt();

        int array[]=new int[array_size];
        int even_ele[]=new int[array_size];
        int odd_ele[]=new int[array_size];

        int even_index=0;
        int odd_index=0;


        for(int i=0; i<array_size; i++){
            System.out.println("Enter Array Element : ");
            array[i]=sc.nextInt();

            if(array[i]%2==0){
                even_ele[even_index]=array[i];
                even_index++;
            }else{
                odd_ele[odd_index]=array[i];
                odd_index++;
            }

        }

        System.out.println("\n-----------------------------\n");
        for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n-----------------------------\n");
        
        int print_odd_index=0,print_even_index=0;
        
        int final_array[]=new int[array_size];
        
        int i=0;
        
        while (print_even_index<even_index && print_odd_index<odd_index) {
            if(i%2==0){
                final_array[i]=even_ele[print_even_index];
                i++;
                print_even_index++;
            }else{
                final_array[i]=odd_ele[print_odd_index];
                print_odd_index++;
                i++;
            }
        }
        
        while(print_even_index<even_index){
            final_array[i]=even_ele[print_even_index];
            print_even_index++;
            i++;
        }
        
        while(print_odd_index<odd_index){
            final_array[i]=odd_ele[print_odd_index];
            print_odd_index++;
            i++;
        }
        
        
        System.out.println("\n-----------------------------\n");
        for(int k=0; k<array_size; k++){
            System.out.print(final_array[k]+"  ");
        }
        System.out.println("\n-----------------------------\n");



    }
}
