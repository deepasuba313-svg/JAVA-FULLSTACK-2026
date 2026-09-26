import java.util.Scanner;
public class prb16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) 
		{
			char currentCharacter=str.charAt(i);
			if(currentCharacter != ' ' && (i == 0 || str.charAt(i - 1) == ' '))
			{
			    count++;
			}
		}
		System.out.print(count);
		
		ip.close();
	}
}
