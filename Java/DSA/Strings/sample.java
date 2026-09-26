import java.util.Scanner;
public class sample {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String s=ip.nextLine();
		System.out.print("Please enter the string: ");
		String t=ip.nextLine();
		boolean flag=false;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<t.length();j++)
            {
                if(s.charAt(i)==t.charAt(j))
                    flag=true;
            }
        }
        System.out.print(flag);
		ip.close();
	}
}
