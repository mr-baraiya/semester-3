//Write a program to implement a Binary Search using Array
import java.util.Scanner;

public class DS_LAB_91_BinarySearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the elemant to be Search : ");
        int target = sc.nextInt();
        int index = binarySearch(arr, target);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println(target+" is found At : "+index+"th index.");
        }
        sc.close();
    }
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
