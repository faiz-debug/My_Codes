import java.util.*;
public class zeros_one_two_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		my_sort(arr);
		dutch_flag_algo(arr);
	}
	public static void my_sort(int[] arr) {
		int zero=0,one=0,two=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				zero++;
			else if(arr[i]==1)
				one++;
			else
				two++;
		}
		int i=0;
		while(zero>0) {
			arr[i]=0;
			i++;
			zero--;
		}
		while(one>0) {
			arr[i]=1;
			i++;
			one--;
		}
		while(two>0) {
			two--;
			arr[i]=2;
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void dutch_flag_algo(int[] arr) {
		int mid=0,low=0,high=arr.length-1;
		int temp;
		while(mid<=high) {
			if(arr[mid]==0) {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
				mid++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
