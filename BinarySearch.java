package Search_Algorithms;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array,int size,int number){
        int left=0,right=size-1,mid;

        while(left<=right){
            mid=(left+right)/2;
            if(array[mid]==number){
                return mid;
            }
            else if(array[mid]<number){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size= scan.nextInt();
        int[] array=new int[size];
        System.out.println("Enter array numbers:");
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        System.out.print("Enter the searching number:");
        int number=scan.nextInt();
        if(binarySearch(array,size,number)==-1){
            System.out.println("Item not found");
        }
        else{
            System.out.println("Item found at "+binarySearch(array,size,number)+" index");
        }
    }
}
