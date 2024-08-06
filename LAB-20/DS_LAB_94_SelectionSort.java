//94. Write a program to implement Selection Sort using Array
public class DS_LAB_94_SelectionSort {
    public static void main(String[] args) {
        int [] arr = {10,5,67,34,23,42};
        int [] res = selectionSort(arr);
        System.out.println("Sorted Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int [] selectionSort(int [] arr){
        if(arr.length == 0 || arr.length == 1){
            return arr;
        }
        for(int i=0;i<arr.length-1;i++){
            int minIdx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            if(minIdx != i){
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        } 
        return arr;
    }
}