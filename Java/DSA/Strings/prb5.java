import java.util.Scanner;
public class prb5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		int lw=0;int up=0;
		for(int i=0;i<str.length();i++)
		{
			int a = (int)str.charAt(i);
			if(a >= 97 && a <= 122)
				lw++;
			else if(a >= 65 && a <= 90)
				up++;
		}
		System.out.print("The lowercase of the entered string was: "+lw + " \n Uppercase was : "+up);
		ip.close();
	}

}
