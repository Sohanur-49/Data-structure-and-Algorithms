package Sort_Algorithms;

import java.util.Scanner;

public class InsertionSort {
    public void insertionSort(int[] Array,int size){
        int temp,j;
        for(int i=1;i<size;i++){
            temp=Array[i];
            j=i-1;
            while(j>=0 && Array[j]>temp){
                Array[j+1]=Array[j];
                j--;
                }
               Array[j+1]=temp;
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
        InsertionSort object=new InsertionSort();
        object.insertionSort(Array,size);
    }
}
