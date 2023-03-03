package Sort_Algorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] Array,int size){
        int temp;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1;j++){
                if(Array[j]>Array[j+1]){
                    temp=Array[j];
                    Array[j]=Array[j+1];
                    Array[j+1]=temp;
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
        bubbleSort(Array,size);
    }
}
