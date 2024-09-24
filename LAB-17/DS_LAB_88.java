/*88. In an array of 20 elements, arrange 15 different values, which are generated 
randomly between 1,00,000 to 9,99,999. Use hash function to generate key and 
linear probing to avoid collision. H(x) = (x mod 18) + 2. Write a program to input 
and display the final values of array.  */
import java.util.Arrays;

public class DS_LAB_88 {
    public static int [] hash = new int[20];
    public static void main(String[] args) {
        int [] arr = new int[15];
        for(int i=0;i<15;i++){
            int x = (int)(Math.random()*999999)+100000;
            arr[i] = x;
        }
        storeInHash(arr);
        System.out.println(Arrays.toString(hash));
    }

    public static void storeInHash(int [] arr){
        for(int i=0;i<arr.length;i++){
            int index = hashFunction(arr[i]);
            hash[index] = arr[i];
        }
    }

    public static int hashFunction(int temp){
        int index = (temp % 18) + 2;
        if(hash[index] != 0){
            while(hash[index] != 0){
                index = (++index) % 20;
            }
        }
        return index;
    }
}

































// import java.util.Arrays;
// import java.util.Scanner;

// public class DS_LAB_88 {
//     static int[] hash = new int[20];
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[15];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         store(arr);
//         System.out.println(Arrays.toString(hash));
//         sc.close();
//     }
//     public static void store(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             int index = hashFn(arr[i]);
//             hash[index] = arr[i];
//         }
//     }
//     public static int hashFn(int n) {
//         int index = (n % 18) + 2;
//         if (hash[index] != 0) {
//             while (hash[index] != 0) {
//                 index = (++index) % 20;
//             }
//         }
//         return index;
//     }
// }
