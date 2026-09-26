import java.util.Scanner;
public class prb33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string-1: ");
		String str1=ip.nextLine();
		System.out.print("Please enter the string-2: ");
		String str2=ip.nextLine();
		String res="";
		for(int i=0;i<str1.length();i++)
		{
				if(str1.charAt(i)==str2.charAt(i))
				{
					res+=str1.charAt(i);
				}
		}
		System.out.print(res);
		ip.close();
	}

}
