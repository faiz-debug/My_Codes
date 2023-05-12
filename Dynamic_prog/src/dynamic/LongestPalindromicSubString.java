package dynamic;
import java.util.*;
public class LongestPalindromicSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "bbab";
		System.out.println(DPLpReccurssion(inp,0,inp.length()-1));
		System.out.println(DPTD(inp, 0, inp.length()-1, new int[inp.length()][inp.length()]));
		System.out.println(DPBU(inp));
	}

	public static int DPLpReccurssion(String inp,int vdx1,int vdx2) {		
		char c1 = inp.charAt(vdx1);
		char c2 = inp.charAt(vdx2);
		
		if(vdx1>vdx2)
			return 0;
		if(vdx1==vdx2)
			return 1;
		int l=0;
		if(c1==c2) {
			 l = DPLpReccurssion(inp, vdx1+1, vdx2-1)+2;
		}else {
			int a = DPLpReccurssion(inp, vdx1+1, vdx2);
			int b = DPLpReccurssion(inp, vdx1, vdx2-1);
			return Math.max(a, b);
		}
		return l;
	}
	public static int DPTD(String inp,int vdx1,int vdx2,int strg[][]) {
		char c1 = inp.charAt(vdx1);
		char c2 = inp.charAt(vdx2);
		
		if(vdx1>vdx2)
			return 0;
		if(vdx1==vdx2)
			return 1;
		if(strg[vdx1][vdx2]!=0) {
			return strg[vdx1][vdx2];
		}
		int l=0;
		if(c1==c2) {
			 l = DPLpReccurssion(inp, vdx1+1, vdx2-1)+2;
		}else {
			int a = DPLpReccurssion(inp, vdx1+1, vdx2);
			int b = DPLpReccurssion(inp, vdx1, vdx2-1);
			l = Math.max(a, b);
		}
		strg[vdx1][vdx2] = l;
		return l;
	}
	public static int DPBU(String inp) {
		int n = inp.length();
		int [][] strg = new int[n][n];
		
		for(int slide=0;slide<=n-1;slide++) {
			for(int vdx1=0;vdx1<=n-slide-1;vdx1++) {
				int vdx2  =vdx1+slide;
				char c1 = inp.charAt(vdx1);
				char c2 = inp.charAt(vdx2);
				
				if(vdx1==vdx2)
					strg[vdx1][vdx2]=1;
				else {
					int ans=0;
				
					if((c1==c2))
					ans = strg[vdx1+1][vdx2-1] +2;
				 else {
					int a = strg[vdx1+1][vdx2];
					int b = strg[vdx1][vdx2-1];
					ans = Math.max(a, b);
				}
					strg[vdx1][vdx2] = ans;
			}
		}
	}
		return strg[0][n-1];
}
}