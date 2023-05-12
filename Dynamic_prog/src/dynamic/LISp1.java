package dynamic;
import java.util.*;
public class LISp1 {

	public static int betterLen(int[] arr) {
		// 
		return 1;
	}
	public static int len(int[] arr) {
		// Here we create a array that stores values for each value that tells us about LIS up-to that index
		// Firstly we fill every index of this new array with value 1, as even if there's no inc value up-to that value that self value will give 1(of itself) as maximum LIS
		// Now we iterate through array and make a new loop that checks increasing values up-to a particular outer index. 
		// If this condition is met we update the current answer array with maximum between value already present & updated value 
		// Also keep updating maximum length in each iteration.
		int max = 1;
		int[] ans = new int[arr.length];
		Arrays.fill(ans, 1);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					ans[i] = Math.max(ans[i], ans[j]+1);
					max=Math.max(max, ans[i]);
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		
	int[] arr = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
	System.out.println(len(arr));  // ORDER N^2
	//System.out.println(betterLen(arr));
	}
}
