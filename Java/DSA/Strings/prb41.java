import java.util.Scanner;

public class prb41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string-1: ");
		String str=ip.nextLine();
		int left=0;
		int max=0;
		for(int i = 0; i < str.length(); i++)
		{
		    for(int j = left; j < i; j++)
		    {
		        if(str.charAt(i) == str.charAt(j))
		        {
		            left++;
		        }
		    }

		    int value = i - left + 1;
			if(value>max)
				max=value;
		}
		System.out.print(max);
		ip.close();
		
	}

}
