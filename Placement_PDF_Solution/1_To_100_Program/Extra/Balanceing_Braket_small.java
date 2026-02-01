package Extra;

import java.util.Scanner;

public class Balanceing_Braket_small {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String : ");
        String str=sc.nextLine();

        while ((str.contains("{}")) || (str.contains("[]")) || (str.contains("()"))) {
                 str=str.replace("{}", "").replace("[]", "").replace("()", "");
        }

        if(str.length()==0){
            System.out.println("String Is Balance : ");
        }else{
            System.out.println("String In Not Balance : ");
        }
          
        
    }
}
