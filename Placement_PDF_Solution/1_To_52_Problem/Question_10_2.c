#include<stdio.h>

int main(){

    int array_size;

    printf("Enter Array Size : ");
    scanf("%d",&array_size);

    int array[array_size+1];

    for(int i=0; i<array_size; i++){
        printf("Enter Array Element : ");
        scanf("%d",&array[i]);
    }

    printf("\nOriginal Array : ");
    for(int i=0; i<array_size; i++){
        printf(" %d ",array[i]);
    }

    int insert_index, insert_value;

    printf("\n\nEnter Element Insert Index : ");
    scanf("%d",&insert_index);

    printf("Enter Element Insert Value : ");
    scanf("%d",&insert_value);

    array_size++;

    for(int i=array_size-2; i>=insert_index-1; i--){
        array[i+1]=array[i];
    }

    array[insert_index-1]=insert_value;


    printf("\nNew Array : ");
    for(int i=0; i<array_size; i++){
        printf(" %d ",array[i]);
    }

    return 0;
}
