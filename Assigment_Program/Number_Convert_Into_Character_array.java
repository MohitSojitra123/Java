import java.util.Scanner;

class Number_Convert_Into_Character_array{
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter Any Number : ");
          int digit=sc.nextInt();

          String str_num=String.valueOf(digit);

          char ch_num[]=str_num.toCharArray();

          for(int i=0; i<ch_num.length; i++){
              System.out.println(ch_num[i]+" ");
          }

    }
}