import java.util.Scanner;
public class prb20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		System.out.print("Please enter the character: ");
		char c=ip.next().charAt(0);
		boolean flag=false;
		int index=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
				flag=true;
				index=i;
			}
			
		}
		
		if(flag)
			System.out.print(index);
		else
			System.out.print(-1);
		ip.close();
	}

}
