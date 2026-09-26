import java.util.Scanner;
public class prb10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i)+ " : " + (int)str.charAt(i));
		}
		ip.close();
	}

}
