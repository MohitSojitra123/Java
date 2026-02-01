//  {[()]} => true
//  {[(])]} => false
//  {[([]])]} => true
//  {} () [] => true

package Extra;

import java.util.ArrayList;
import java.util.Scanner;

public class Balanceing_Bracket {
    public static void main(String[] args) {

          ArrayList<Character> list1=new ArrayList<>();
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Strgin : ");
        String str=sc.nextLine();

        char[] str_char=str.toCharArray();

        boolean IsBalance=true;

        for(int i=0; i<str_char.length; i++){
            
              if(str_char[i] == '{' || str_char[i] == '[' || str_char[i] == '(' ){
                   list1.add(str_char[i]);
              }else{

                // }()[]{} ==> checking } first close...
                 if(list1.isEmpty()){
                    IsBalance=false;
                    break;
                 }

                char Temp = list1.remove(list1.size()-1);

                if(Temp == '{' && str_char[i] != '}'){
                    IsBalance=false;
                    break;
                }else if(Temp == '[' && str_char[i]!=']'){
                    IsBalance=false;
                    break;
                }else if(Temp == '(' && str_char[i]!=')'){
                    IsBalance=false;
                    break;
                }
              }
        }


    //    {}(){   => last bracket checking
        if(!list1.isEmpty()){
            IsBalance=false;
        }

        if(IsBalance){
             System.out.println("String Is Balance : ");
        }else{
            System.out.println("String Is Not Balance : ");
        }


          

    }
}
