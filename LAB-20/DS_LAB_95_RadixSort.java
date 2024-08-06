//95. Write a program to implement Radix Sort using Array.
public class DS_LAB_95_RadixSort {
    public static void main(String[] args) {
        int [] arr = {10,5,67,34,23,42};
        int [] res = radixSort(arr);
        System.out.println("Sorted Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int [] radixSort(int [] arr){
        if(arr.length == 0 || arr.length == 1){
            return arr;
        }
        return arr;
    }
}