// Write a program that should decode the given pattern and print the resulting expanded string. 
// Input: 2a3bc4dE5F2G7H 
// Output: aabbbcddddEFFFFFGGHHHHHHH 

#include<stdio.h>
#include<ctype.h>

int main(){

      char ch[20];

      printf("Enter String : ");
      scanf("%s",&ch);

      int num=0;

      for(int i=0; ch[i]!='\0'; i++){
          if(isdigit(ch[i])){
                num=ch[i]-'0';
                for(int j=1; j<=num; j++){
                    printf("%c",ch[i+1]);
                } 
                i++;
          }else{
            printf("%c",ch[i]);
          }
      }

}