//90. Write a program to implement a Linear Search using Array.
import java.util.Scanner;

public class DS_LAB_90_LinearSerch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the elemant to be Search : ");
        int target = sc.nextInt();
        int index = linearSearch(arr, target);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println(target+" is found At : "+index+"th index.");
        }
        sc.close();
    }
    public static int linearSearch(int [] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
