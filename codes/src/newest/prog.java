package newest;
import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n, new int[] arr) {
    if (n <= 1)
      return n;
    if(arr[n]!=0)
    	return arr[n];
    
    return calc_fib(n - 1) + calc_fib(n - 2);
    arr[n] = calc_fib(n - 1) + calc_fib(n - 2);
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println(calc_fib(n,arr));
  }
}
