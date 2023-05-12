package dynamic;

import java.util.Arrays;

public class String_Edit_Distance {

	public static void main(String[] args) {
		String n1 = "abcd";
		String n2 = "agcfd";
		System.out.println(distance(n1, n2, 0, 0));
		int[][] arr = new int[n1.length()][n2.length()];
		for(int i=0;i<n1.length();i++)
			Arrays.fill(arr[i], -1);
		System.out.println(Dis_TD(n1,n2,0,0,arr));
		System.out.println(Dis_BU(n1, n2));
	}
	public static int Dis_BU(String n1, String n2) {
		
		int[][] arr = new int[n1.length()+1][n2.length()+1];
		
		for(int vdx1= n1.length();vdx1>=0;vdx1--) {
			for(int vdx2= n2.length();vdx2>=0;vdx2--) {
				if(vdx1==n1.length())
					arr[vdx1][vdx2] = n2.length()-vdx2;
				else if(vdx2==n2.length())
					arr[vdx1][vdx2] = n1.length()-vdx1;
				else {
				char ch1 = n1.charAt(vdx1);
				char ch2 = n2.charAt(vdx2);
				int ans=0;
				if(ch1==ch2) {
					ans = arr[vdx1+1][vdx2+1];
				}else {
					int a = arr[vdx1+1][vdx2];
					int b = arr[vdx1][vdx2+1];
					int c = arr[vdx1+1][vdx2+1];
					ans = Math.min(a, Math.min(b, c)) + 1;
				}
				arr[vdx1][vdx2]=ans;
			}
			}
		}
		return arr[0][0];
	}
	public static int Dis_TD(String n1, String n2, int vdx1, int vdx2,int[][] arr) {
		if(vdx1==n1.length() || vdx2==n2.length())
			return Math.max(n1.length()-vdx1, n2.length()-vdx2); 
		if(arr[vdx1][vdx2]!=-1){
			return arr[vdx1][vdx2];
		}
		char ch1 = n1.charAt(vdx1);
		char ch2 = n2.charAt(vdx2);
		int ans=0;
		if(ch1==ch2) {
			ans = Dis_TD(n1, n2, vdx1+1, vdx2+1,arr);
		}else {
			int a = Dis_TD(n1, n2, vdx1+1, vdx2,arr);
			int b = Dis_TD(n1, n2, vdx1, vdx2+1,arr);
			int c = Dis_TD(n1, n2, vdx1+1, vdx2+1,arr);
			ans = Math.min(a, Math.min(b, c)) +1;
		}
		arr[vdx1][vdx2]=ans;
		return ans;
	}
	public static int distance(String n1, String n2, int vdx1, int vdx2) {
		if(vdx1==n1.length() || vdx2==n2.length())
			return Math.max(n1.length()-vdx1, n2.length()-vdx2);
		char ch1 = n1.charAt(vdx1);
		char ch2 = n2.charAt(vdx2);
		int ans=0;
		if(ch1==ch2) {
			ans = distance(n1, n2, vdx1+1, vdx2+1);
		}else {
			int a = distance(n1, n2, vdx1+1, vdx2);
			int b = distance(n1, n2, vdx1, vdx2+1);
			int c = distance(n1, n2, vdx1+1, vdx2+1);
			ans = Math.min(a, Math.min(b, c)) +1;
		}
		return ans;
	}
    
}
