import java.util.Scanner;
public class prb9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		int count=0;
		System.out.print("Please enter the character: ");
		char c=ip.next().charAt(0);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
				count++;
		}
		System.out.print(count);
		ip.close();
	}

}
