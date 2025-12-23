// Given a string S of length n, the task is to find the earliest repeated character in it. The earliest repeated 
// character  means,  the  character  that  occurs  more  than  once  and  whose  second  occurrence  has  the 
// smallest index. 
// Input: s = "geeksforgeeks"  
// Output: e  
// Explanation: e is the first element that repeats

import java.util.Scanner;

public class Question_31_2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter Strgin : ");
        String str=sc.nextLine();
        
        int visited_arr[]=new int[256];

        for(int i=0; i<str.length(); i++){
                if(visited_arr[str.charAt(i)] == 1){
                    System.out.println("First Repeatad Element : "+str.charAt(i));
                    break;
                }else{
                    visited_arr[str.charAt(i)]=1;
                }
        }

    }
}
