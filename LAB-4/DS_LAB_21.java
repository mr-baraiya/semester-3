import java.util.Scanner;
public class DS_LAB_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        int oldIndex = 0;
        System.out.println("Enter the new Number : ");
        int num = sc.nextInt();
        System.out.println("enter the number at which index : ");
        int index = sc.nextInt();
        int [] newArr = new int[arr.length+1];
        for(int i=0 ; i < arr.length+1 ; i++){
            if(i==index){
                newArr[i] = num;
            }
            else{
                newArr[i] = arr[oldIndex];
                oldIndex++;
            }
        }
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}