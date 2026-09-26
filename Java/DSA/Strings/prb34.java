import java.util.Scanner;
public class prb34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string-1: ");
		String str1=ip.nextLine();
		System.out.print("Please enter the string-2: ");
		String str2=ip.nextLine();
		int i=0,j=0;
		while(i<str1.length()&&j<str2.length())
		{
			
			if(str1.charAt(i)==str2.charAt(j)) {
				i++;
				j++;
			}
			
			else
				j++;
		}
		if(i==str1.length())
			System.out.print(true);
		else
			System.out.print(!true);
		ip.close();
	}

}
