package dynamic;
import java.util.*;

public class String3LCS {
	public static int LCS_recc(String n1,String n2,String n3,int v1, int v2, int v3,int[][][] arr) {
		if(v1==n1.length() || v2==n2.length() || v3==n3.length())
			return 0;
		if(arr[v1][v2][v3] != -1)
			return arr[v1][v2][v3];
		char c1 = n1.charAt(v1);
		char c2 = n2.charAt(v2);
		char c3 = n3.charAt(v3);
		int len=0;
		if(c1==c2 && c2==c3) {
			len = LCS_recc(n1, n2, n3, v1+1, v2+1, v3+1,arr) + 1 ;
		}else {
			int a = LCS_recc(n1, n2, n3, v1+1, v2, v3,arr);
			int b = LCS_recc(n1, n2, n3, v1, v2+1, v3,arr);
			int c = LCS_recc(n1, n2, n3, v1, v2, v3+1,arr);
			len = Math.max(a, Math.max(b, c));
		}
		arr[v1][v2][v3] = len;
		return len;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String n1 = "abcd";
	    String n2 = "agcfd";
	    String n3 = "acd";
	    int[][][] arr = new int[n1.length()][n2.length()][n3.length()];
	    for(int i =0;i<arr.length;i++)
	    	for(int j=0;j<arr[0].length;j++)
	    		Arrays.fill(arr[i][j], -1);
	    System.out.println(LCS_recc(n1,n2,n3,0,0,0,arr));
	    System.out.println(LCS_BU(n1,n2,n3));
	}
	public static int LCS_BU(String n1, String n2, String n3) {
		int[][][] arr = new int[n1.length()+1][n2.length()+1][n3.length()+1];
		for(int i=n1.length()-1;i>=0;i--) {
			for(int j=n2.length()-1;j>=0;j--) {
				for(int k=n3.length()-1;k>=0;k--) {
					char c1 = n1.charAt(i);
					char c2 = n2.charAt(j);
					char c3 = n3.charAt(k);
					int len=0;
					if(c1==c2 && c2==c3) {
						len = arr[i+1][j+1][k+1] + 1;
					}else {
						int a = arr[i+1][j][k];
						int b = arr[i][j+1][k];
						int c = arr[i][j][k+1];
						len = Math.max(a, Math.max(b, c));
					}
					arr[i][j][k] = len;
				}
			}
		}
		return arr[0][0][0];
	}
}