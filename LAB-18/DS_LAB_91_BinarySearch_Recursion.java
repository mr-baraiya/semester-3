//Write a program to implement a Binary Search using Array
import java.util.Scanner;

public class DS_LAB_91_BinarySearch_Recursion {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the elemant to be Search : ");
        int target = sc.nextInt();
        int index = binarySearch(arr, target, 0, arr.length - 1);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println(target+" is found At : "+index+"th index.");
        }
        sc.close();
    }
    public static int binarySearch(int[] arr, int target , int low , int high) {
        int mid = (low+high)/2;
        if(low > high){
            return -1;
        }
        if(mid == target){
            return mid;
        }
        if(target < mid){
            return binarySearch(arr,target,low,mid-1);
        }
        if(mid > target){
            return binarySearch(arr,target,mid+1,high);
        }
        return -1;
    }
}
