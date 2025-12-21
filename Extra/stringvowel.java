import java.util.Scanner;
public class stringvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countvowel=0 ,countconsnant=0;

        System.out.println("Enter string");
        String a = sc.nextLine();

        String ab = a.toLowerCase();

       for(int i=0;i<ab.length();i++){
            
           char ch = ab.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch == 'u'){
                ++countvowel;
            }
            else{
                ++countconsnant;
            }
        }

        System.out.println("vowels"+countvowel+"\n");
        System.out.println("consnant"+countconsnant);


        

    }
}
