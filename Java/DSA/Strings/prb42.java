import java.util.Scanner;

public class prb42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string-1: ");
		String str=ip.nextLine();
		int count=0;
		for(int i = 0; i < str.length(); i++)
		{
		    for(int j = i; j < str.length(); j++)
		    {
		        boolean unique = true;

		        for(int k = i; k < j; k++)
		        {
		            if(str.charAt(k) == str.charAt(j))
		            {
		                unique = false;
		            }
		        }

		        if(unique)
		        {
		            count++;
		        }
		    }
		}
		System.out.print(count);
		ip.close();
	}

}
