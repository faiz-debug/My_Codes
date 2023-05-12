package codes;
import java.util.*;
public class countBit {

	public static void substring(String val,String ans) {
		if(val.length()==0) {
			System.out.println(ans);
			return ;
		}
		char ch1 = val.charAt(0);
		String left = val.substring(1);
		substring(left , ans);
		substring(left , ans+ch1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = "";
		System.out.println(st.equals(null));
	//	String val = sc.nextLine();
	//	String val = sc.nextLine();
		//substring(val,"");
//		for(int i=0;i<val.length();i++) {
//			for(int j=i;j<val.length();j++) {
//				
//			}
//		}
//		HashMap<Character,Integer> map = new HashMap<>();
//		String ans = "";
//		for(int i=0;i<val.length();i++) {
//			if(!map.containsKey(val.charAt(i))) {
//				map.put(val.charAt(i),1);
//			}else {
//				map.put(val.charAt(i),map.get(val.charAt(i))+1);
//			}
//		}
		
		
}
}
