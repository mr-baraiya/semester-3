//96. Write a program to implement Merge Sort using Array
public class DS_LAB_96_MergeSort {
    static int [] arr = {12,34,56,32,12,45,76,98,65,90};                                                                                               
    public static void main(String[] args) {
        if(arr.length == 0){
            System.out.println("Array is empty.");
            return;
        }
        mergeSort(0,arr.length-1);
        System.out.println("Sorted Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int low , int high){
        int mid = (int) Math.floor((low+high)/2);
        if(low < high){
            mergeSort(low, mid);
            mergeSort(mid+1, high);
        }
        merge(low,high,mid);
    }
    public static void merge(int low , int high , int mid){
        int [] temp = new int[arr.length];
        int h = low;
        int i = low;
        int j = mid + 1;
        while(h <= mid && j<= high){
            if(arr[h] <= arr[j]){
                temp[i] = arr [h];
                h++;
            }else{
                temp[i] = arr[j];
                j++;
            }
            i++;
        }
        if(h > mid){
            for(int k=j;k<=high;k++){
                temp[i] = arr[k];
                i++;
            }
        }else{
            for(int k=h;k<=mid;k++){
                temp[i] = arr[k];
                i++;
            }
        }
        for(int k=low;k<=high;k++){
            arr[k] = temp[k];
        }
    }
}