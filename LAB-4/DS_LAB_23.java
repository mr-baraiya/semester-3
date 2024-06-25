import java.util.Scanner;

public class DS_LAB_23 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int oldIndex = 0;
        int [] arr = {1,12,23,45,59};
        System.out.println("Enter the new Number : ");
        int num = sc.nextInt();
        int [] newArr = new int[arr.length+1];
        boolean flag = true;
        for(int i=0 ; i < arr.length+1 ; i++){
            if(flag){
                if(arr[i] > num){
                    newArr[i] = num;
                    flag = false;
                    continue;
                }
            }
            newArr[i] = arr[oldIndex];
            oldIndex++;
        }
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}
