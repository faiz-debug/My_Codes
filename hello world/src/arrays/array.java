package arrays;
import java.util.*;

public class array{
	public static int fibo(int n)
	{
		int series=0;
		if(n==0 || n==1)
			return n;                         
	return fibo(n-1) + fibo(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = fibo(n);
		System.out.println(ans);
	}	
}