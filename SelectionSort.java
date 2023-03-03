package Sort_Algorithms;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] Array,int size){
        int temp,min;
        for(int i=0;i<size-1;i++){
           min=i;
           for(int j=i+1;j<size;j++){
               if(Array[i]>Array[j]){
                   min=j;
               }
               if(min!=i){
                   temp=Array[i];
                   Array[i]=Array[min];
                   Array[min]=temp;
               }
           }
        }
        for(int k=0;k<size;k++){
            System.out.print(Array[k]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size=scan.nextInt();
        int[] Array=new int[size];
        System.out.print("enter Array elements: ");
        for(int i=0;i<size;i++){
            Array[i]=scan.nextInt();
        }
        selectionSort(Array,size);
    }
}
