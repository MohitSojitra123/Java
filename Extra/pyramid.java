public class pyramid {
    public static void main(String[] args) {
        int i,j,rows=5,cols=5,k;

          for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
           for(i=1;i<=5;i++){
            for(j=5;j>=i;j--){
                System.out.print("*");
                
            }
            System.out.println();
        }
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
                
            }
            for(k=i;k<=5;k++){
                System.out.print("*");
            }
            System.out.println();
        }
           for(i=1;i<=5;i++){
            for(j=i;j<=5;j++){
                System.out.print(" ");
                
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5)
                System.out.print("*");
                else
                System.out.print(" ");
            }
           
            System.out.println();
        }
        for(i=0;i<=rows;i++){
            for(j=0;j<=rows;j++){
                if(i == 0 || i == rows-1 || j==rows-1-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (i = 0; i <= rows; i++) {
         for (j = rows; j >= 1; j--) {
            if (j > i) {
               System.out.print("*");
            }
            else
               System.out.print(" ");
         } 
         System.out.println(); 
      }      
   }
       
        
    }
