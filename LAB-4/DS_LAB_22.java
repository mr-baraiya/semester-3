import java.util.Scanner;
public class DS_LAB_22 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        int oldIndex = 0;
        System.out.println("enter the index : ");
        int index = sc.nextInt();
        int [] newArr = new int[arr.length-1];
        for(int i=0 ; i < arr.length ; i++){
            if(i==index){
                continue;
            }
            newArr[oldIndex] = arr[i];
            oldIndex++;
        }
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    } 
}
