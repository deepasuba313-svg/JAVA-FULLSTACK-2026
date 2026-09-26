import java.util.HashSet;
import java.util.Scanner;
public class prb30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Character> set=new HashSet<>();
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=ip.nextLine();
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
			if(set.contains(str.charAt(i)))
			{
				flag=false;
				break;
			}
			else
				set.add(str.charAt(i));
			
		}
		
		if(flag)
			System.out.print(true);
		else
			System.out.print(false);
			ip.close();
	}

}
