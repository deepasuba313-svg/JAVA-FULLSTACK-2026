import java.util.Scanner;

public class prb29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		int max=0;
		for(int i=0;i<str.length();i++)
		{
			int a=(int)str.charAt(i);
			if(a>max)
				max=a;
		}
		System.out.print((char)max);
		ip.close();
	}

}
