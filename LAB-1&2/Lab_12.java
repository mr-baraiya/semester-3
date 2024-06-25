public class Lab_12{
	public static void main(String[] args) {
		int i,dig,n,num,j;
		for(i=1;i<=1000;i++){
			dig=0;
			n=i;
			j=i;
			num=0;
			while(n!=0){
				dig++;
				n/=10;
			}
			while(j!=0){
				num += Math.pow(j%10,dig);
				j/=10;
			}
			if(i==num){
				System.out.print(i+",");
			}
		}
	}
}