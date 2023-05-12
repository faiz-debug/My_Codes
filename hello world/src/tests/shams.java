package tests;
import java.util.*;

public class shams {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while(x!=0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int [] arr = new int[n];
		    for(int i=0;i<n;i++)
		    arr[i] = sc.nextInt();
		    int count=0;
		    for(int i=0;i<n;i++){
		          if(arr[i]>=arr[k])
		          count++;
		    }
		    System.out.println(count);
		    
		    x--;
		}
}
//.....................................................................................................	
	// Bubble SORT:
/*    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i =0;i<n;i++)
			arr[i] = sc.nextInt();
		for(int i =1;i<=n-1;i++)
			for(int j =0;j<=n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		System.out.print(Arrays.toString(arr));
} */
// ......................................................................................................	
	// MERGE SORT:
/*	public static int [] totalsort(int[] left,int[] right) {
		int [] mergesort = new int[left.length+right.length];
		int i=0,k=0,j=0;
		while(i<left.length && j<right.length) {
			if(left[i] < right[j]) {
				mergesort[k] = left[i];
				i++;
				k++;
			}
			else {
				mergesort[k] = right[j];
				j++;
				k++;
			}}
			while(i<left.length) {
				mergesort[k] = left[i];
				i++;
				k++;
			}
			while(j<right.length) {
				mergesort[k] = right[j];
				j++;
				k++;
			}
			return mergesort;
		}
	public static int [] sort(int[] arr,int start,int end) {
		if(start==end) {
			int [] b = new int[1];
			b[0]=arr[start];
			return b;
		}
		int mid = (start+end)/2;
		int [] left = sort(arr,start,mid);
		int [] right = sort(arr,mid+1,end);
		int [] total = totalsort(left,right);
		return total;
		
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++)
    	   arr[i] = sc.nextInt();
       System.out.println(Arrays.toString(sort(arr,0,n-1)));
  }   */
//........................................................................................................
	
}
