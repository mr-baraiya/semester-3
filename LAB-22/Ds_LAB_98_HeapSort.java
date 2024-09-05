//98. Write a program to implement Heap Sort using Array

public class Ds_LAB_98_HeapSort {
    public static void main(String [] args){
        int[] arr = {4, 2, 10, 67, 89, 23, 8, 2, 18};
        int n = arr.length;
        arr = heapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int [] heapSort(int [] arr){
        arr = buildMaxHeap(arr);
        for(int i = arr.length-1;i>0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr,i,0);
        }
        return arr;
    }

    public static int [] buildMaxHeap(int [] arr){
        for(int i=arr.length/2-1;i>=0;i--){
            heapify(arr,arr.length,i);
        }
        return arr;
    }

    public static int[] heapify(int[] arr, int n, int i) {
        int maxIdx = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left<n && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }
        if(right<n && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }
        if(maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(arr, n,maxIdx);
        }
        return arr;
    }
}