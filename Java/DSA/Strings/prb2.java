import java.util.Scanner;
public class prb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			count=i+1;
		}
		System.out.print("The length of the entered string was: "+count);
		ip.close();
	}

}
