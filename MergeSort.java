package Sort_Algorithms;

import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] array,int lb,int ub){
        if(lb<ub){
            int mid=lb+(ub-lb)/2;
            mergeSort(array,lb,mid);
            mergeSort(array,mid+1,ub);
            merge(array,lb,mid,ub);
        }
    }

    public static void merge(int[] array,int lb,int mid,int ub){
        int n1=mid-lb+1;
        int n2=ub-mid;
        int[] a=new int[n1];
        int[] b=new int[n2];
        for(int i=0;i<n1;i++){
            a[i]=array[lb+i];
        }
        for(int j=0;j<n2;j++){
            b[j]=array[mid+j+1];
        }
        int i=0,j=0,k=lb;
        while(i<n1&&j<n2){
            if(a[i]<b[j]){
                array[k]=a[i];
                i++;
                k++;
            }
            else{
                array[k]=b[j];
                j++;
                k++;
            }
        }
       while(i<n1){
           array[k]=a[i];
           i++;
           k++;
       }
        while(j<n2){
            array[k]=a[j];
            j++;
            k++;
        }
    }
    //Mergesort follows divide and conquer method.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=scan.nextInt();
        int[] Array=new int[size];
        System.out.print("Enter array Elements: ");
        for(int i=0;i<size;i++) {
            Array[i]=scan.nextInt();
        }
        mergeSort(Array,0,size-1);
        for(int i=0;i<size;i++) {
            System.out.print(Array[i]+" ");
        }
    }
}
