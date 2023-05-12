import java.util.*;
public class codechef_practice {

	 public static boolean is_pali(String val,int vdxs, int vdxe){
         int l = vdxs, r=vdxe;
         while(l<r){
               char ch1 = val.charAt(l);
               char ch2 = val.charAt(r);
               if(ch1 != ch2)
               return false;
               l++;
               r--;
         }
         return true;
   }
	 static int flag=0;
	 public static void myFunc(int n,int pos,int neg) {
		 if(pos==neg && flag ==1)
			 return;
		 if(n>0 && flag ==0) {
			 System.out.print(n-5+" ");
			 myFunc(n-5,pos+1,neg);
		 }else {
			 flag=1;
			 System.out.print(n+5+" ");
			 myFunc(n+5,pos,neg+1);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos=0,neg=0;
		System.out.print(n +" ");
		myFunc(n,pos,neg);

}
	}
