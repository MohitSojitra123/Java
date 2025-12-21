public class check_prime_number {
     public static void main(String[] args) {
        
          check_prime_number cp=new check_prime_number();

          int ans=cp.check_prime(10);

          System.out.println(ans);

     }

     public int  check_prime(int num){
          int count=0;
            for(int i=1; i<=num; i++){
                 if(num%i==0){
                      count++;
                 }
            }
            if(count==2){
                return 1;
            }else{
                return 0;
            }
     }


}
