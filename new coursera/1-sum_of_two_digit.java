package coursera;
import java.util.*;
public class 1-sum_of_two_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		String Value[] = value.split(" ");

		int a = Integer.parseInt(Value[0]);
		int b =  Integer.parseInt(Value[1]);
		System.out.println(a+b);
	}

}
