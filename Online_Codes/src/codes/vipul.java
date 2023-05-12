package codes;
import java.util.*;
public class vipul {
	static int max =  Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String val= "yolo";  /*1st code*/
//		code(val);
//		int[] arr = {1,2,5,4,3,1};
//		code(arr);
		Scanner sc = new Scanner(System.in);
		//akash1();
		akash2();
	}
	public static void akash2() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ques = sc.nextLine();
		int ans =0,i=0;
		while(i<=n-1) {
			if(ques.charAt(i)=='0') {
				ans+=1;
				i+=3;
			}
			i++;
		}
		System.out.println(ans);
	}
	public static void akash1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		int ans=0;
		for(int i=0; i<n;i++) {
			ans+= arr[i]*Math.pow(2, i);
		}
		System.out.println(ans);
	}
	public static void code(int[] arr) {
		int min=Integer.MAX_VALUE;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], i);
			}else {
				if(min>i-map.get(arr[i])) {
					min= i-map.get(arr[i]);
				}
			}
		}
		System.out.println(min);
	}
	public static void code(String val) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<val.length();i++) {
			Character ch = val.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch,1);
			}
		}
		System.out.println(map);	
	}
	public static long playlist(int[] time) {
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    int[] time= new int[songs.size()];
	    for(int i=0;i<songs.size();i++) {
	    	time[i] = songs.get(i);
	    }
	    long count = 0;
	    
	    for(int t : time){
	        if(t % 60 == 0){
	            count += map.getOrDefault(0, 0);
	        }
	        else{
	            count += map.getOrDefault(60 - t % 60, 0); 
	            
	        }
	        map.put(t % 60, map.getOrDefault(t % 60, 0) + 1); 
	       
	    }
	    return count;
	}
}
