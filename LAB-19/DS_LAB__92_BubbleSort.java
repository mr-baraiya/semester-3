//92. Write a program to implement Bubble using Array.
public class DS_LAB__92_BubbleSort{
    public static void main(String[] args) {
        int [] arr = {10,5,67,34,23,42};
        int [] res = bubbleSort(arr);
        System.out.println("Sorted Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int [] bubbleSort(int [] arr){
        if(arr.length == 0 || arr.length == 1){
            return arr;
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}