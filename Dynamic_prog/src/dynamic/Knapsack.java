package dynamic;
import java.util.*;

public class Knapsack {
	public static int KnapsackRecc(int[] weight,int[] price,int vdx,int cap) {
		
		if(cap==0 || vdx==weight.length)
			return 0;
		
		int b = KnapsackRecc(weight, price,vdx+1,cap);
		
		int a = 0;
		if(cap>= weight[vdx])
		a = KnapsackRecc(weight,price,vdx+1,cap-weight[vdx]) + price[vdx];
		
		return Math.max(a,b);
	}
	public static int KnapDP(int[] weight,int[] price,int vdx,int cap,int[][] arr){
		
		if(cap==0 || vdx==weight.length)
			return 0;
		if(arr[vdx][cap] != 0)
			return arr[vdx][cap];
		
		int b = KnapDP(weight, price,vdx+1,cap,arr);
		int a = 0;
		if(cap>= weight[vdx])
		a = KnapDP(weight,price,vdx+1,cap-weight[vdx],arr) + price[vdx];
		
		arr[vdx][cap] = Math.max(a, b);
		return Math.max(a,b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weight = {1,3,4,5};
		int[] price =  {1,4,5,7};
		int cap = 7;
		int[][] arr = new int[weight.length][cap+1]; 
		
		int vdx = 0;
		
		System.out.println(KnapsackRecc(weight,price,vdx,cap));
		System.out.println(KnapDP(weight, price, vdx, cap, arr));

	}

}
