package aug_31;
import java.util.*;
public class codes {
	public static void mine() {
		
	}
	
	public static void main(String[] args) throws Exception{
		 Scanner sc = new Scanner(System.in);
		/* int [] arr = {1,2,3,4,5};
		try {
			arr[5]=6;
		}
        catch (Exception e){
			System.out.println("Array index out of bound, check");
		}
		finally {
			System.out.println("A GYA SWAAD");
		} */
		// int n = sc.nextInt();
		// sc.nextLine();
//		String ans = sc.nextLine();
//		Stack<Integer> my = new Stack<>();
//		int[] arr = {1,2,4,3,5};
//		my.push(6);
//		String ans = "231*+9-";
//		String ch = "" + ans.charAt(0);
//		int a = Integer.parseInt(ch);
//		a=a*2;
//		System.out.println(a);
//*****************************************************************************************************		 
/*	    int n = sc.nextInt();
	    int count=0,i,num=1;
		while(count<n) {
			num = num + 1;
			for(i=2;i<=num;i++) {
				if(num%i==0)
					break;
			}
			if(i==num)
				count++;
		}
		 System.out.println(n+" Prime no is "+num);   */
//*****************************************************************************************************	
/*		 int n = 10000000;
		 int[] SOE = new int[10000000];
		 ArrayList<Integer> ans = new ArrayList<>();
		 Arrays.fill(SOE,1);
		 for(int i=2;i<Math.sqrt(n);i++) {
			 if(SOE[i]==1) {
				 for(int j=i*i;j<n;j+=i) {
					 SOE[j]=0;
				 }
			 }
		 }
		 for(int i=2;i<n;i++) {
			 if(SOE[i]==1) {
				 ans.add(i);
			 }
		 }
		 //System.out.println(ans);
		 int m = sc.nextInt();
		 System.out.println(ans.get(m-1));      (Seive of Erastosthenis) */
//******************************************************************************************************
		// int n = sc.nextInt();
		 System.out.println(Integer.MAX_VALUE);
		 }
	}