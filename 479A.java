import java.util.*;
 
public class solution
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int ans=a+b+c;
		ans=Math.max(ans,(a*b*c));
		ans=Math.max(ans,(a+b)*c);
		ans=Math.max(ans,a*(b+c));
		ans=Math.max(ans,a+(b*c));
		ans=Math.max(ans,(a*b)+c);
		
		System.out.print(ans);
	
	}
	
}
