import java.util.*;
public class Countofnumbers
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		while(a!=0)
		{
		    count+=1;
		    
		    a=a/10;
		}
		System.out.println(count);
	
	    
	}
}
