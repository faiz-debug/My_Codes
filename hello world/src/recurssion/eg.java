package recurssion;
import java.util.*;
public class eg {
/*	public static int search(int []arr,int n,int val,int inc)
	{
		if(inc == n)
			return -1;
		int send=search(arr,n,val,inc+1);
		    if( send==-1 && arr[inc]==val)
				return inc;
		    return send;
	}
	public static void main(String[] args) {
		int [] arr = {1,4,3,4,5,4,3,5};
		int val=3,inc=0;
		System.out.println("Value found at "+search(arr,8,val,inc));
	}  */
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
	       String value = "aaaabbcccccaaaaaaaaaaccccde";
	    // int ch = value.charAt(0)
	     //  System.out.println(value.substring(0,0));
		int count=0,l=value.length();
		char ch = value.charAt(0);
		for(int i=0;i<l;i++) 
		{
			int count1 = 1;
			for(int j=i+1;j<l;j++) 
			{
				if(value.charAt(i)!=value.charAt(j)) 
					break;
				count1++;
			}
			if(count1>count) {
				count = count1;
				ch = value.charAt(i);
			}
		}
		System.out.println(ch);
	}
}
