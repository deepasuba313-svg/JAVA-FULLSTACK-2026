import java.util.Scanner;
public class prb15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		str=str.replace(' ', '-');
		System.out.print(str);
		
		ip.close();
	}
}
