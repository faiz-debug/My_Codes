package dynamic;
import java.util.*;
public class KthLCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n1 = "abcd";
		String n2 = "agcfd";
		int k=1;
		
		System.out.println(KLCSRecc(n1,n2,k,0,0));
		
		int[][][] arr = new int[k+1][n1.length()+1][n2.length()+1];
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[0].length;j++)
				Arrays.fill(arr[i][j], -1);
		
		System.out.println(KLCSTD(n1,n2,k,0,0,arr));
		System.out.println(KLCSBU(k, n1, n2));
	}
	public static int KLCSRecc(String n1,String n2,int k,int vdx1,int vdx2) {
		// TODO Auto-generated method stub
		int ans=0;
		
		if(vdx1==n1.length() || vdx2==n2.length())
			return 0;
		if(n1.charAt(vdx1)==n2.charAt(vdx2)) {
			ans = KLCSRecc(n1, n2, k, vdx1+1, vdx2+1) + 1;
		}else {
			int a = KLCSRecc(n1, n2, k, vdx1+1, vdx2);
			int b = KLCSRecc(n1, n2, k, vdx1, vdx2+1);
			int c=0;
			if(k>=1) {
				c = KLCSRecc(n1, n2, k-1,vdx1+1, vdx2+1) + 1;
			}
			ans = Math.max(a, Math.max(b, c));
		}
		return ans;
	}
	public static int KLCSTD(String n1,String n2,int k,int vdx1,int vdx2,int[][][] arr) {
		// TODO Auto-generated method stub
		int ans=0;
		
		if(vdx1==n1.length() || vdx2==n2.length())
			return 0;
		if(arr[k][vdx1][vdx2]!=-1)
			return arr[k][vdx1][vdx2];
		if(n1.charAt(vdx1)==n2.charAt(vdx2)) {
			ans = KLCSRecc(n1, n2, k, vdx1+1, vdx2+1) + 1;
		}else {
			int a = KLCSRecc(n1, n2, k, vdx1+1, vdx2);
			int b = KLCSRecc(n1, n2, k, vdx1, vdx2+1);
			int c=0;
			if(k>=1) {
				c = KLCSRecc(n1, n2, k-1,vdx1+1, vdx2+1) + 1;
			}
			ans = Math.max(a, Math.max(b, c));
		}
		arr[k][vdx1][vdx2] = ans;
		return ans;
	}
    public static int KLCSBU(int k,String n1,String n2) {
    	int[][][] arr = new int[k+1][n1.length()+1][n2.length()+1];
    	
    	int tk = k;
    	for(k=0;k<=tk;k++)
    	for(int vdx1=n1.length()-1;vdx1>=0;vdx1--) {
    	    for(int vdx2=n2.length()-1;vdx2>=0;vdx2--) {	
    	
    	int ans=0;
		if(n1.charAt(vdx1)==n2.charAt(vdx2)) {
			ans = arr [k][vdx1+1][vdx2+1] + 1;
		}else {
			int a = arr[k][vdx1+1][vdx2];
			int b = arr[k][vdx1][vdx2+1];
			int c=0;
			if(k>=1) {
				c = arr[k-1][vdx1+1][vdx2+1] + 1;
			    }
			ans = Math.max(a, Math.max(b, c));
		    }
		arr[k][vdx1][vdx2]=ans;
         }
     }
     return arr[tk][0][0];
   }
}

