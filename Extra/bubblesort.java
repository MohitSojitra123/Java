public class bubblesort {
    public static void main(String[] args) {
        int[]  arr = {20,30,40,5,60,65,5};

        

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                int temp;
                if(arr[j]>arr[j+1])
                {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
