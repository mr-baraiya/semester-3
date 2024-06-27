import java.util.Scanner;

class ArrayDatabase {
    int[] data;
    public ArrayDatabase(int[] data) {
        this.data = data;
    }
    public static int sum(int[] data) {
        int sum=0;
        for(int i=0; i<data.length; i++) {
            sum+=data[i];
        }
        return sum;
    }
    public static int min(int[] data) {
        int min=data[0];
        for(int i=1; i<data.length; i++) {
            if(min>data[i]) {
                min=data[i];
            }
        }
        return min;
    }
    public static int max(int[] data) {
        int max=data[0];
        for(int i=1; i<data.length; i++) {
            if(data[i]>max) {
                max=data[i];
            }
        }
        return max;
    }
    public static double avg(int[] data) {
        int sum=0;
        for(int i=0; i<data.length; i++) {
            sum+=data[i];
        }
        return (double) sum/data.length;
    }
}
public class DS_LAB_28 {  
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] data = new int[n];
        for(int i=0; i<n; i++) {
            System.out.println("Enter an element at data["+i+"]: ");
            data[i] = sc.nextInt();
        }
        ArrayDatabase ad = new ArrayDatabase(data);
        System.out.println("Sum = "+ ad.sum(data));
        System.out.println("Min = "+ ad.min(data));
        System.out.println("Max = "+ ad.max(data));
        System.out.println("Average = "+ ad.avg(data));
        sc.close();
    }    
}