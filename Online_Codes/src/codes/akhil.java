package codes;
import java.util.*;
public class akhil {
	public class Employee{
		
		
		double salery,commission;
		String name,id;
		
		public Employee( String name,String id,double salery, double commission) {
			this.name = name;
			this.id = id;
			this.salery = salery;
			this.commission = commission;
		}
		public double Salery(Employee this) {
			if(this.id =="Manager")
				return (this.salery+(this.commission*0.3));
			else if(this.id=="Lead")
				return (this.salery+(this.commission*0.25));
			else 
				return (this.salery+(this.commission*0.2));
		}
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			Employee E1 = new Employee("faiz","Associate",30000,5000);
//			System.out.println(Salery(E1));
//			
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		int left =0,right =value.length()-1;
		while(left<right) {
			char ch1 = value.charAt(left);
			char ch2 = value.charAt(right);
			if(ch1!=ch2) {
				System.out.println("NOT PALINDROME");
				System.exit(0);
			}
			left++;
			right--;
		}
		System.out.println("PLAINDROME");
	}

}
