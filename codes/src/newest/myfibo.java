package newest;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class myfibo {
		/*long number = n % 60;
    if (number <= 1)
    {
        return number;
    }
    else
    {
        long long long a = 0;
        long long long b = 1;
        long long long c = 1;
        for (long i = 2; i <= number; i++)
        {
            c = (long long)a + b;
            a = b;
            b = c;
        }
        return c % 10;
    }*/
	 private static long getFibonacciLastDigitNaive(long n) {
		 long number = n % 60;
		    if (number <= 1)
		    {
		        return number;
		    }
		    else
		    {
		        long a = 0;
		        long b = 1;
		        long c = 1;
		        for (long i = 2; i <= number; i++)
		        {
		            c = a + b;
		            a = b;
		            b = c;
		            
		        }
		        return c % 10;
		    }
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        long n = scanner.nextLong();
	        long c = getFibonacciLastDigitNaive(n);
	        System.out.println(c);
	    }

}
