// Write a program that recognize strings that contains a pattern wcwR (where w={a,b} and 
// wR means reverse of string w)


// 📘 Question in Very Simple Words
// You have to write a program that checks whether a given string follows the pattern:
// w c wᴿ
// Where:
// w is any string made only of a and b
// c is exactly one character c in the middle
// wᴿ is the reverse of w


// 🧠 Meaning of the Pattern wcwᴿ
// Think of it like a mirror around the letter c.
// left part (w)   c   right part (reverse of w)
// 🔍 Important Rules
// The string must contain only a, b, and one c
// The c must be exactly in the middle
// Characters after c must be the reverse of characters before c

// 🧪 Examples
// ✅ Valid Strings
// String	w	c	wᴿ	Valid?
// aca	a	c	a	✔
// abcba	ab	c	ba	✔
// bbcbb	bb	c	bb	✔
// c	`` (empty)	c	``	✔

// ❌ Invalid Strings
// String	Reason
// abca	Right part is not reverse
// aabbcbb	Not symmetric
// abccba	More than one c
// abcab	Right part not reverse

import java.util.Scanner;

public class Program_77 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Any Strgin : ");
        String str=sc.nextLine();


         char str_char[]=str.toCharArray();
         int end=str_char.length-1;
         boolean Isvalide=true;

        for(int start=0; start<str_char.length; start++){
              if(start<end){
                if(str_char[start]!=str_char[end]){
                    Isvalide=false;
                    break;
                }
              }else{
                 if (str_char[start]!='c') {
                        Isvalide=false;
                }
                break;
              }
              end--;
        }
        if(Isvalide){
            System.out.println("Right : "+str);
        }else{
            System.out.println("Wrong : "+str);
        }
    }
}
