import java.util.Scanner;
public class prb7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		for(int i=0;i<str.length();i++)
		{
			int a = (int)str.charAt(i);
			a=a-32;
			System.out.print((char)a);		}
		ip.close();
	}

}
