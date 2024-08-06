//93. Write a program to implement Insertion Sort using Array.
public class DS_LAB_93_InsertionSort {
    public static void main(String[] args) {
        int [] arr = {10,5,67,34,23,42};
        int [] res = insertionSort(arr);
        System.out.println("Sorted Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int [] insertionSort(int [] arr){
        if(arr.length == 0 || arr.length == 1){
            return arr;
        }
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}  