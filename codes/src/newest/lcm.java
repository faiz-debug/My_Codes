package newest;
import java.util.*;
public class lcm {

	private static int gcd_naive(int a, int b) {
	    
	    if(a==0)
	    return b;
	    return gcd_naive(b%a, a);
	}
	    private static long lcm_naive(int a, int b) {
	    	int f = gcd_naive(a,b);
	    	if(f==1)
	    		return a*b;
	        long c = ((a/f)*b);
	        return c;
	      }

	    public static void main(String args[]) {
	        Scanner scanner = new Scanner(System.in);
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        long A = (long)a;
	        long B = (long)b;
	        System.out.println((A*B));
	        System.out.println(lcm_naive(a, b));
	      }

}
