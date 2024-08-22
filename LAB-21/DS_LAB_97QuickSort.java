//97. Write a program to implement Quick Sort using Array.
public class DS_LAB_97QuickSort {
    static int [] arr = {23,54,12,89,32,54,45,90};
    public static void main(String[] args) {
        quickSort(0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } 
    public static void quickSort (int lb , int ub){
        boolean flag = true;
        if(lb < ub){
            int i = lb;
            int j = ub + 1;
            int key = arr[lb];
            while(flag){
                i = i + 1;
                while(arr[i] < key){
                    i = i+ 1;
                }
                j = j - 1;
                while(key < arr[j]){
                    j = j - 1;
                }
                if(i < j){
                    int temp1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp1;
                }else{
                    flag = false;
                }
            }
            int temp2 = arr[lb];
            arr[lb] = arr[j];
            arr[j] = temp2;
            quickSort(lb, j-1);
            quickSort(j+1, ub);
        }
    }
}