import java.util.Scanner;

public class prb39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		System.out.print("Please enter the string to find: ");
		String str1=ip.nextLine();
		
		//System.out.print(str);
		if(str.length()==str1.length())
		{
			str+=str;
			if(str.contains(str1))
				System.out.println(true);
		}
		else
			System.out.println(!true);
		ip.close();
		//int left=0,right=0;
		//if((isDigit(charAt(left))&&(isDigit(charAt(right)))) ||  (isLetter(charAt(left))&&(isLetter(charAt(right)))))
		{
			
		}
	}

}
