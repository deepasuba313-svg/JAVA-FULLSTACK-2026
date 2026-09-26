import java.util.Scanner;

public class prb40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string-1: ");
		String str=ip.nextLine();
		System.out.print("Please enter the string-2: ");
		String str1=ip.nextLine();
		System.out.print(str.startsWith(str1));
		ip.close();
			
	}

}
