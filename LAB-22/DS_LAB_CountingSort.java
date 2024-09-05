//Write a program to implement Counting Sort using Array

public class DS_LAB_CountingSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 67, 89, 23, 8, 2, 18};
        arr = countingSort(arr);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] countingSort(int[] arr) {
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        int[] output = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        return output;
    }
}
