import java.util.Scanner;
public class LCM {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter the element: ");
		int a=ip.nextInt();
		int b=ip.nextInt();
		int res=lcm(a,b);
		int lcm=(a*b)/res;
		System.out.print(lcm);
		ip.close();
	}

	private static int lcm(int a,int b) {
		// TODO Auto-generated method stub
		//LCM * GCD = a*b
		// LCM= a * b / GCD
		while(b!=0)
		{
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
}
