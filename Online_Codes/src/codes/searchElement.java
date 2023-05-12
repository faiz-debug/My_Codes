package codes;
import java.util.*;
import java.util.Arrays;

public class searchElement {

	public static void main(String[] args) {
//		int[] arr = new int[10];
//		for(int i=0;i<10;i++) {
//			if(i==8)
//				arr[i] = 10;
//			else
//				arr[i] =  i+1;
//		}
//		int val=0;
//		System.out.println(Arrays.toString(arr));
//		HashMap<Integer,Integer> map = new HashMap<>();
//		for(int i=0;i<10;i++) {
//			if(!map.containsKey(arr[i]))
//				map.put(arr[i], i);
//		}
//		System.out.println(map);
//		for(int i=0;i<10;i++) {
//			if(!map.containsKey(i+1))
//				System.out.println(i+1);
//		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n-2;i++) {
			if(arr[i]<arr[i+1]) {
				arr[i+1]=arr[i+2];
			}
		}
		System.out.println(Arrays.toString(arr));
		//System.out.print(maxOR(a,b));
	}
	public static int maxOR(int a,int b) {
		int result=0;
		String A = Integer.toBinaryString(a);
		String B = Integer.toBinaryString(b);
		int Aone=0,Bone=0;
		// counting Ones
		for(int i=0;i<A.length();i++) {
			if(A.charAt(i)=='1')
				Aone++;
		}
		for(int i=0;i<B.length();i++) {
			if(B.charAt(i)=='1')
				Bone++;
		}
		// updating strings
		String a1 ="";
		for(int i=0;i<A.length();i++) {
			if(Aone!=0) {
				a1+=""+'1';
				Aone--;
			}else
				a1+="" + '0';
		}
		String b1 ="";
		for(int i=0;i<B.length();i++) {
			if(Bone!=0) {
				b1+=""+'1';
				Bone--;
			}else
				b1+="" + '0';
		}
		System.out.println(A+" "+B);
		System.out.println(a1+" "+b1);
		int mya = Integer.parseInt(a1,2);
		int myb = Integer.parseInt(b1,2);
		result = mya | myb;
	
		return result;
	}

}
