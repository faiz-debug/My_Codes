package dynamic;

public class LCS {

	public static void main(String[] args) {
		String s1 = "abcdasbdncxvnjf";  //abcd
		String s2 = "agcfdnvbsjghldn";   // agcfd
		int[][] arr = new int[s1.length()+1][s2.length()+1];
		
	//	System.out.println(lcs(s1,s2));
	//	System.out.println(lcsVIDX(s1, s2, 0, 0));
		System.out.println(lcsVIDXTD(s1, s2, 0, 0, arr)); // THIS ARRAY SHOULD STORE -1 AT ALL INDEXES IF WE DONT WANT TO CREATE MISMATCH OF RETURNING VALUES FOR LENGTH 0 AND SIZE 0;
	    StringBuilder fin = new StringBuilder();
		System.out.println(lcsUP(s1,s2,arr,fin));
	    System.out.println(fin.reverse());
	}
	private static int lcs(String s1,String s2) {
		// TODO Auto-generated method stub
		if(s1.length()==0 || s2.length()==0)
			return 0;
		
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		
		String s1Left = s1.substring(1);
		String s2Left = s2.substring(1);
		
		int ans =0;
		if(ch1==ch2) {
			ans = lcs(s1Left, s2Left) +1;
		}else {
			int one = lcs(s1, s2Left);
			int two = lcs(s1Left, s2);
			ans = Math.max(one, two);
		}
		return ans;
	}
	private static int lcsVIDX(String s1,String s2,int vdx1,int vdx2) {
		// TODO Auto-generated method stub
		if(s1.length()==vdx1 || s2.length()==vdx2)
			return 0;
		
		char ch1 = s1.charAt(vdx1);
		char ch2 = s2.charAt(vdx2);
		
		int ans =0;
		if(ch1==ch2) {
			ans = lcsVIDX(s1, s2,vdx1+1,vdx2+1) +1;
		}else {
			int one = lcsVIDX(s1, s2,vdx1,vdx2+1);
			int two = lcsVIDX(s1, s2,vdx1+1,vdx2);
			ans = Math.max(one, two);
		}
		return ans;
	}
	private static int lcsVIDXTD(String s1,String s2,int vdx1,int vdx2,int[][] arr) {
		// TODO Auto-generated method stub
		if(s1.length()==vdx1 || s2.length()==vdx2)
			return 0;     
		
		if(arr[vdx1][vdx2]!=0)
			return arr[vdx1][vdx2];
		
		char ch1 = s1.charAt(vdx1);
		char ch2 = s2.charAt(vdx2);
		
		int ans =0;
		if(ch1==ch2) {
			ans = lcsVIDXTD(s1, s2,vdx1+1,vdx2+1,arr) + 1;
		}else {
			int one = lcsVIDXTD(s1, s2,vdx1,vdx2+1,arr);
			int two = lcsVIDXTD(s1, s2,vdx1+1,vdx2,arr);
			ans = Math.max(one, two);
		}
		arr[vdx1][vdx2]=ans;
		return ans;
	}
    private static int lcsUP(String s1,String s2,int[][] arr,StringBuilder fin) {
		// TODO Auto-generated method stub
    	for(int cr = s1.length()-1;cr>=0;cr--) {
    		for(int cc = s2.length()-1;cc>=0;cc--) {
    			char ch1= s1.charAt(cr);
    			char ch2= s2.charAt(cc);
    			
    			if(ch1==ch2) {
    				arr[cr][cc] = arr[cr+1][cc+1] + 1;
    				fin.append(ch1);
    			}else {
    				int a = arr[cr][cc+1];
    				int b = arr[cr+1][cc];
    				arr[cr][cc] = Math.max(a, b);
    			}
    		}
    	}
    	return arr[0][0];
	}
}

