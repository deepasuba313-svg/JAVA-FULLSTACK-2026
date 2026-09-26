import java.util.Scanner;

public class prb6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		int lw=0;int up=0,digit=0,spl=0;
		for(int i=0;i<str.length();i++)
		{
			int a = (int)str.charAt(i);
			if(a >= 97 && a <= 122)
				lw++;
			else if(a >= 65 && a <= 90)
				up++;
			else if(a >= 48 && a <= 57)
				digit++;
			else
				spl++;
		}
		System.out.print("Lowercase: "+lw+"\nUppercase : "+up+"\nDigit: "+digit+"\nSpecial Characters: "+spl);
		ip.close();
	}

}
