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
        int max = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int place = 1; max/place > 0;place = place * 10){
            countSort(arr, arr.length, place);
        }
        return arr;
    }

    public static void countSort(int [] arr , int n,int place){
        int output[] = new int[n];
        int i = 0;
        int count[] = new int[10];
        for(i=0;i<n;i++){
            count[(arr[i]/place)%10]++;
        }
        for(i=1;i<10;i++){
            count[i] += count[i - 1];
        }
        for(i = n-1;i>=0;i--){
            output[count[(arr[i]/place)%10]-1] = arr[i];
            count[(arr[i] / place) % 10]--;
        }
        for(i=0;i<n;i++){
            arr[i] = output[i];
        }
    }
}