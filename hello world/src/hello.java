import java.util.Scanner;
import java.util.*;
public class hello {
	
	static int fin= Integer.MAX_VALUE;  // global var fin.
	public static void sort(int n, int m, int cr, int cc,int ans) {
		if(cr == n && cc == m) {
			if(fin>ans)
				fin=ans;
			    return;
		}
		if(cr>n || cc>m) {
			return;
		}
		sort(n, m, cr, cc+cr, ans+1);
		sort(n, m, cr+cc, cc, ans+1);	
	}
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		/*
		int n = sc.nextInt();
		int m = sc.nextInt();
		sort(n,m,1,1,0);
		// i> x,x+y
		// ii> x+y,y
		if(fin==Integer.MAX_VALUE)
			System.out.println(-1);
		else
		System.out.println(fin);	 */
		parent(2,2,1,1,"",2);	
	}
	static int Ans = Integer.MAX_VALUE;
	public static void parent(int n,int m,int sr,int sc, String fin,int val) {
		// TODO Auto-generated method stub
		if(sr==n && sc==m) {
			if(Ans>val) {
				Ans=val;
			System.out.println(fin);
			System.out.println(val);}
			return;
		}
		if(sr>n || sc>m)
			return;
		parent(n, m, sr+1, sc,fin+sr+sc+" ",val+1);
		parent(n, m, sr, sc+1,fin+sr+sc+" ",val+1);
	}
}