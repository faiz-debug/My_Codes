import java.util.*;
public class Composite_numbers_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int left = sc.nextInt();
		int right = sc.nextInt();
		find_com(left,right);		
	}
	public static void find_com(int left,int right) {
		boolean[] bool =new boolean[right+1]; 
		for(int i=2;i<bool.length;i++)
			bool[i] = true;
//		Arrays.fill(bool, true);
		
		for(int i=2;i<=Math.sqrt(right);i++) {
			if(bool[i]==true) {
			for(int j=i*i;j<=right;j=j+i) 
				bool[j]=false;
		    }
		}
//		for(int i=left;i<=right;i++) {
//			if(bool[i]==true) {
//				System.out.println(i);
//			}
//		}
		
		int l=left,r=l+1;
		
		while(r<=right) {
			if(bool[l]==true) {
				l=r;
				r=l+1;
			}else {
				int count=1,a=0,b=0;
				while( r!=right+1 && bool[r]!=true ) {
					
					if(count>5) {
						a=l;
						b=r;
					}
					r++;
					count++;				
				}
				if(a!=0&&b!=0)
					System.out.println(a+" "+b+" "+(b-a+1));
				l=r+1;
				r=l+1;
			}
		}
	}
}
