package oops;

public class client {

	public static void main(String[] args) {
		pokemon p1 = new pokemon();
		p1.name =  "Pikachu";
		p1.type =  "Electric";
		p1.hp=100;
		p1.strength=10;
		
		pokemon p2 = new pokemon();
		p2.name = "Chalizad";
		p2.type= "Fire";
		p2.strength=12;
		p2.hp = 10;
		
		p1.attack(p2);   //this--->P1, other-->p2 
	}

}
