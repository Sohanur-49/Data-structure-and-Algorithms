package Sort_Algorithms;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] array,int low,int high){
        if(low<high){
            int pivotIndex=partition(array,low,high);
            quickSort(array,low,pivotIndex-1);
            quickSort(array,pivotIndex+1,high);
        }
    }
    public static int partition(int[] Array,int low,int high){
        int pivot=Array[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(Array[j]<pivot){
                i++;
                int temp=Array[i];
                Array[i]=Array[j];
                Array[j]=temp;
            }
        }
        i++;
        int temp=Array[i];
        Array[i]=Array[high];
        Array[high]=temp;
        return i;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=scan.nextInt();
        int[] Array=new int[size];
        System.out.print("Enter array Elements: ");
        for(int i=0;i<size;i++) {
            Array[i]=scan.nextInt();
        }
        quickSort(Array,0,size-1);
        System.out.println("Sorting elements are: ");
        for(int i=0;i<size;i++) {
            System.out.print(Array[i]+" ");
        }
    }
}
