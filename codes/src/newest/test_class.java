package newest;
import java.util.*;
class check{
	int length=1;
	int bredth=2;
	void check(int length,int bredth){
		this.length=length+1;
		this.bredth=bredth+1;
		System.out.println(length+"  "+bredth);
	}
}
public class test_class {

	public static void main(String[] args) {
		check c1 = new check();
		check c2 = new check();
		c1.check(3, 4);
		c2.check(5, 6);
		System.out.println(c1.length+"  "+c1.bredth);
		System.out.println(c2.length+"  "+c2.bredth);
	}

}
