public class sorting_array {
    public static void main(String[] args) {
        
          int array[]={10,40,20,50,60,30,69,70,30,73,4,1};

            System.out.println("----------------------------------");
          for(int i=0; i<array.length; i++){
              System.out.print(array[i]+" ");
            }
            System.out.println();
            System.out.println("----------------------------------");

          int temp=0;

          for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                  if(array[i]>array[j]){
                       temp=array[i];
                       array[i]=array[j];
                       array[j]=temp; 
                  }
            }
          }

          System.out.println("----------------------------------");
          for(int i=0; i<array.length; i++){
              System.out.print(array[i]+" ");
            }
            System.out.println();
            System.out.println("----------------------------------");

    }
}
