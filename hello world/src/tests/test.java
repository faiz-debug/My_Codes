package tests;
import java.util.*;
//NOKIA KEYPAD.
public class test {
/*	private static String mapping(char inp) {
		// TODO Auto-generated method stub
		char cc = inp;
		if(cc=='2')
			return "abc";
		else if(cc=='3')
			return "def";
		else if(cc=='4')
			return "ghi";
		else if(cc=='5')
			return "jkl";
		else if(cc=='6')
			return "mno";
		else if(cc=='7')
			return "pqrs";
		else if(cc=='8')
			return "tuv";
		else if(cc=='9')
			return "wxyz";
		else
		return "";
	}
	public static void result(String inp,String out) {
		if(inp.length()==0) {
			System.out.println(out);
			return;
			}
		char val = inp.charAt(0);
		String ans = mapping(val);
		
		//System.out.println();
		for(int ci=0;ci<ans.length();ci++) {
		char ch = ans.charAt(ci);
		String leftinp = inp.substring(1);
		result(leftinp, out+ch);
		}
	}  */
	public static void subarr(int[] arr, int size,int ci) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		   // result("23","");
		int[] arr = {1,2,3};
		subarr(arr,3,0);
		
    }
}
	

