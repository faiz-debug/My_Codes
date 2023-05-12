package dynamic;
import java.util.*;
public class wineproblem {

	public static void main(String[] args) {
		int[] arr = {2,3,5,1,4};
		
		System.out.println(WPRecurrsion(arr, 0, arr.length-1));
		System.out.println(WPTD(arr, 0, arr.length-1, new int[arr.length][arr.length]));
		System.out.println(WPBU(arr));
	}
	public static int WPRecurrsion(int[]arr,int si,int ei) {
		int yr = arr.length + si - ei;
		if(si==ei) {
			return arr[si]*yr;
		}
		int a = WPRecurrsion(arr, si+1, ei) + arr[si]*yr; 
		int b = WPRecurrsion(arr, si, ei-1) + arr[ei]*yr;
		
		return Math.max(a, b);
	}
	public static int WPTD(int[] arr,int si,int ei,int[][]ans) {
		int yr = arr.length + si - ei;
		if(si==ei) {
			return arr[si]*yr;
		}
		if(ans[si][ei]!=0) {
			return ans[si][ei];
		}
		int a = WPTD(arr, si+1, ei,ans) + arr[si]*yr; 
		int b = WPTD(arr, si, ei-1,ans) + arr[ei]*yr;
		
		ans[si][ei] = Math.max(a, b);
		return Math.max(a, b);
	}
    public static int WPBU(int[] arr) {
    	int n = arr.length;
    	int[][] strg = new int[n][n];
    	for(int slide =0;slide<=n-1;slide++) {
    		for(int si = 0;si<=n-slide-1;si++) {
    			int ei = si+slide;
    			int yr = n-ei+si;
    			
    			if(si==ei)
    				strg[si][ei] = arr[si]*yr;
    			else {
    				int a = strg[si+1][ei] + arr[si]*yr;
    				int b = strg[si][ei-1] + arr[ei]*yr;
    				
    				strg[si][ei] = Math.max(a,b);
    			}
    		}
    	}
    	return strg[0][n-1];
    }
}
