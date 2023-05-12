package randoms;
import java.util.*;
public class shamshad {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		long num = sc.nextLong();
//		long a=0,b=1,c;
//		Long[] fibo = new Long[100];
//		fibo[0] = a;fibo[1]=b;
//		if(a==num || b==num)
//		{
//			System.out.println("Its fibo");
//			System.exit(0);
//		}
//		for(int i=2;i<=100;i++) {
//			c=a+b;
//			fibo[i-1]= c;
//			if(c==num) {
//				System.out.println("Its fibo");
//				System.out.println(Arrays.toString(fibo));
//				System.exit(0);
//			}
//			a=b;
//			b=c;
//			if(c>num) {
//				System.out.println("Its not fibo");
//				System.out.println(Arrays.toString(fibo));
//				System.exit(0);
//			}
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t!=0){
		     int a = sc.nextInt();
		     int b = sc.nextInt();
		     if(a==b){
		           System.out.println(a);
		     }else{
		           int count =0;
		           while(a>0 && b>0){
		                 a--;
		                 b--;
		                 count++;
		                 if(a%b==0 || b%a==0){
		                       count++;
		                       break;
		                 }
		           }
		           if(a==0 || b==0)
		           System.out.println("-1");
		           else if(a>b)
		           count+=a;
		           else
		           count+=b;
		           System.out.println(count);
		     }
		      
		 t--;     
		}
		}
		
	public static void min(int[][] arr,int k) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(k>=0) {
					arr[i][j] = 0;
					k--;
				}
			}
		}
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			String val = "";
			for(int j=0;j<arr[0].length;j++) {
				val+= String.valueOf(arr[i][j]);
				}
			int decimal=Integer.parseInt(val,2);
			sum+= decimal;
		}
		System.out.println(sum);
	}
}
