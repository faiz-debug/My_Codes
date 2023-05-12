package newest;
import java.util.*;
public class myfibolast {

	private static long getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        long a = 0;
        long b = 1;

        for (int i = 0; i < n - 1; ++i) {
            long d = a;
            a = b;
            b = d + b;
        }

        return b % 10;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        long c = getFibonacciLastDigitNaive(n);
	        System.out.println(c);
	}

}
