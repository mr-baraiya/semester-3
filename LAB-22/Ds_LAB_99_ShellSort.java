//99. Write a program to implement Shell Sort using Array.
//radix sort
public class Ds_LAB_99_ShellSort {
    public static void main(String [] args){
        int[] arr = {4, 2, 10, 67, 89, 23, 8, 2, 18};
        int n = arr.length;
        arr = shellSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int [] shellSort(int [] arr){
        for(int gap = arr.length/2; gap >= 1; gap = gap/2){
            for(int j = gap;j<arr.length;j++){
                for(int i=j-gap ; i>=0 ; i=i-gap){
                    if(arr[i+gap] > arr[i]){
                        break;
                    }else{
                        int temp = arr[i+gap]; 
                        arr[i+gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
        return arr;
    }
}