import java.util.*;
public class job_a_thon {
	
	public static int my_answer_b(int N, String s, int[] c,int vdx1,int vdx2,int[][] mrr) {
		 if(vdx1==s.length()-2||vdx2==s.length()-4)
		        return 0;
		 if(mrr[vdx1][vdx2] !=0 )
		        return mrr[vdx1][vdx2];
		 int ans=0;
		 char ch1= s.charAt(vdx1);
		 char ch1_1= s.charAt(vdx1+1);
		 char ch2= s.charAt(vdx2);
		 char ch2_2= s.charAt(vdx2+1);
		 if((ch1=='0' && ch1_1=='0')&&(ch2=='1' && ch2_2=='1'))
		        ans= my_answer_b(N,s,c,vdx1+4,vdx2+4,mrr);
		 else{
		        int a = my_answer_b(N,s,c,vdx1+4,vdx2+4,mrr)+c[vdx1];
		        int b = my_answer_b(N,s,c,vdx1+4,vdx2+4,mrr)+c[vdx2];
		        ans= Math.min(a,b);
		        }
		 mrr[vdx1][vdx2]=ans;
		 return ans;
	}

	public static int my_answer(int N, String s, int[] c,int vdx1,int vdx2,int[][] arr){
        if(vdx1==s.length()||vdx2==s.length()+1)
        return 0;
        if(arr[vdx1][vdx2] !=0 )
        return arr[vdx1][vdx2];
        int ans=0;
        char ch1= s.charAt(vdx1);
        char ch2= s.charAt(vdx2);
        if(ch1=='0' && ch2=='1'){
            ans=my_answer(N,s,c,vdx1+2,vdx2+2,arr);
        }else{
            int a = my_answer(N,s,c,vdx1+2,vdx2+2,arr)+c[vdx1];
            int b = my_answer(N,s,c,vdx1+2,vdx2+2,arr)+c[vdx2];
            ans= Math.min(a,b);
        }
        arr[vdx1][vdx2]=ans;
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 22;
		String s="0000001100110011001100";
		int[]c = {1,0,4,0,1,2,3,4,1,2,3,1,2,3,1,3,1,2,3,4,1,2};
        int[][] arr = new int[s.length()+1][s.length()+1];
        int[][] mrr = new int[s.length()+1][s.length()+1];
        int a = my_answer(N,s,c,0,1,arr);
        int b = my_answer_b(N,s,c,0,2,mrr);
        System.out.println(a+" " +b);
        System.out.println(Math.min(a, b));
	}

}
