package arshad;

import java.util.ArrayList;
import java.util.Arrays;

public class mincost {
	public static int calcu(int [] arr) {
		int val =0;
		for(int i=0;i<arr.length-1;i++) {
			val+= ((arr[i]-arr[i+1])*(arr[i]-arr[i+1]));
		}
		return val;
	}
	public static int minans(ArrayList<Integer> ll) {
		int diff = 0,ind=0;
		for(int i=0;i<ll.size()-1;i++) {
			int check = Math.abs(ll.get(i)-ll.get(i+1));
			if(check>diff) {
				diff=check;
				ind=i;
			}
		}
		
		diff= (ll.get(ind)+ll.get(ind+1))/2;
		int minarr [] = new int[ll.size()+1];
		for(int i=0;i<minarr.length;i++) {
			if(i<=ind)
				minarr[i]=ll.get(i);
			else if(i==ind+1)
				minarr[i]=diff;
			else
				minarr[i]=ll.get(i-1);
		}
		System.out.println(Arrays.toString(minarr));
		return calcu(minarr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mylist = new ArrayList<>();
		mylist.add(1);mylist.add(2);mylist.add(6);mylist.add(9);mylist.add(12);
		System.out.println(mylist);
		System.out.println(minans(mylist));
	}

}
