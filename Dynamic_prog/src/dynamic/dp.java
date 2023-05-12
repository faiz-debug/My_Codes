package dynamic;

public class dp {

	public static void main(String[] args) {
		int n=40;
		//System.out.println(DpWays(0,n));
		System.out.println(DpTD(0, n, new int[n]));
	}
	public static int DpWays(int curr,int end) {
		// TODO Auto-generated method stub
		if(curr==end)
			return 1;
		if(curr>end)
			return 0;
		int count=0;
	for(int i=1;i<=6;i++) {
		count += DpWays(curr+i, end) ;
	}
	return count;
	}
	public static int DpTD(int curr,int end,int [] strg) {
		// TODO Auto-generated method stub
		if(curr==end)
			return 1;
		if(curr>end)
			return 0;
		int count=0;
		if(strg[curr]!=0)
			return strg[curr];
	for(int i=1;i<=6;i++) {
		count += DpTD(curr+i, end,strg) ;
	}
	strg[curr]=count;
	return count;
	}
}
