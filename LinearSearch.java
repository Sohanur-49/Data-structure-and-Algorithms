package Search_Algorithms;

import java.util.Scanner;

public class LinearSearch {
    public void linearSearch(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size= scan.nextInt();
        int[] array=new int[size];
        int flag=0;
        System.out.println("Enter array numbers:");
        for(int i=0;i<size;i++){
           array[i]=scan.nextInt();
        }
        System.out.print("Enter the searching number:");
        int n=scan.nextInt();
        for(int i=0;i<size;i++){
            if(array[i]==n){
                System.out.println("Item found at index "+i);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Item not found");
        }
    }
    public static void main(String[] args) {
        LinearSearch object=new LinearSearch();
        object.linearSearch();
    }
}
