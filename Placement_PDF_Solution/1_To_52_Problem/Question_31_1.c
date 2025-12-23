// Given a string S of length n, the task is to find the earliest repeated character in it. The earliest repeated 
// character  means,  the  character  that  occurs  more  than  once  and  whose  second  occurrence  has  the 
// smallest index. 
// Input: s = "geeksforgeeks"  
// Output: e  
// Explanation: e is the first element that repeats

#include<stdio.h>

int main(){

     char str[20];
     int visited_ele[256]={0};  //{0} default all element 0  256 index all element 0

     printf("Enter String : ");
     scanf("%s",&str);

    //  visited_ele[str[i]] == 1 visited_ele is integer array than str[i] return ASCII value this ASCII value Store On 0 to 256 index in visited_ele

     for(int i=0; str[i]!='\0'; i++){
           if(visited_ele[str[i]] == 1){
               printf("First Repeated Element Is : %c ",str[i]);
               break;
           }else{
              visited_ele[str[i]]=1;   
            }
     }




}