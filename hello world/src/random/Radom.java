package random;
import java.time.Month;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.Scanner;

public class Radom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate bf = LocalDate.of(1991,Month.JULY,25);
		LocalDate cd = LocalDate.of(2009, Month.JANUARY, 01);
		long ans = ChronoUnit.DAYS.between(bf,cd);
		System.out.println(ans);
	/*	int n = sc.nextInt();
		int nst=1,nsp=n/2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<nsp;j++)
				System.out.print(" ");
			if(i<n/2)
				nsp--;
			else
				nsp++;
			for(int k=0;k<nst;k++)
				System.out.print("*");
			if(i<n/2)
				nst+=2;
			else
				nst-=2;
				
			System.out.println();   */
	/*	int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int[] brr = new int[m];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		for(int j=0;j<m;j++)
			brr[j] = sc.nextInt();
		
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				
			}
		} */
		//	que();
	}
	public static void que() {
//		String s = "a the b the c the d the e";
//		int count =0;
//		String[] ss = s.split(" the ");
//			
//		for(String a : ss)
//			System.out.println(a+" ");
//		int a = 5;
//		double ans = Math.round(a*5.555*100.0)/100.0;
//		System.out.println(ans);
//		System.out.println(a*5.555);
		String inp = "nitin";
		String ninp="";
		ArrayList<String> fin = new ArrayList<>();
		substring(inp,"");
		
	}
	public static void substring(String inp,String ans) {
		// TODO Auto-generated method stub
		if(inp.length()==0) {
				System.out.print(ans+" ");
     			return;
		}
		char ch = inp.charAt(0);
		String left = inp.substring(1);
		substring(left, ans);
		substring(left, ans+ch);
	}
	
}
