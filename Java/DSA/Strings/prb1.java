import java.util.Scanner;
public class prb1 {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+ " ");
		}
		ip.close();
	}
}
