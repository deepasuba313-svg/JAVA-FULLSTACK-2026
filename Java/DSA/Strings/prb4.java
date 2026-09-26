import java.util.Scanner;

public class prb4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		int vowel=0;int con=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				vowel++;
			else
				con++;
		}
		System.out.print("The vowels of the entered string was: "+vowel + " & consonant was : "+con);
		ip.close();
	}

}
