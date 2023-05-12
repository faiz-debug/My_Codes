package oops;

public class pokemon { //noun
	String name;
	String type;
	int hp;
	int strength;
	
	public pokemon() {
		// TODO Auto-generated constructor stub
		System.out.println("POkemon ban gya");
	}
	// Behavior
	 public void attack(pokemon enemy)
	 {
		System.out.println(this.name); 
	 }		 
}
