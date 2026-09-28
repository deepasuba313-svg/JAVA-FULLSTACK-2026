import java.util.*;
public class GCD {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter the element: ");
		int a=ip.nextInt();
		int b=ip.nextInt();
		int res=gcd(a,b);
		System.out.print(res);
		ip.close();
	}

	private static int gcd(int a,int b) {
		// TODO Auto-generated method stub
		if(b==0)
			return a;
			return gcd(b,a%b);
	}
}
