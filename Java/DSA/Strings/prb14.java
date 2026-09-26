import java.util.Scanner;
public class prb14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)== ' ')
				continue;
			else
				System.out.print(str.charAt(i));
		
		}
		
		ip.close();
	}

}
