package arshad;
import java.util.*;


public class test {
	public static int prefix(ArrayList<Integer> list) {
		
		int[] arr = new int[list.size()];
		
		Collections.sort(list, Collections.reverseOrder());  
		System.out.println(list);
		arr[0] = list.get(0);
		for(int i=1;i<list.size()-1;i++) {
			arr[i] = arr[i-1]+list.get(i);
		}
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				ans++;
			else
				break;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			list.add(sc.nextInt());
		}
		System.out.println(prefix(list));
	}

}
