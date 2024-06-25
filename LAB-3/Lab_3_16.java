//find the position of the largest and smallest number
import java.util.Scanner;
public class Lab_3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }    
        int small=arr[0],large=arr[0],smallidx=0,largeidx=0;
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                small = arr[i];
                smallidx = i;
            }
            if(arr[i]>large){
                large = arr[i];
                largeidx = i;
            }
        }
        System.out.println("Smallest element is "+small+" index = "+(smallidx+1));
        System.out.println("Largest element is "+large+" index = "+(largeidx+1));
    }   
}
