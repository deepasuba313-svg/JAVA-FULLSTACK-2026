import java.util.Scanner;
public class GCD2 {
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
		//int res=0;
		while(b!=0)
		{
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
}
