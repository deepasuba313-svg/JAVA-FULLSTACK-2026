import java.util.Scanner;

public class prb36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		String words[]=str.split(" ");
		String res[]=new String[words.length];
		for(int i=0;i<words.length;i++)
		{
			res[i] = "";
			for(int j=words[i].length()-1;j>=0;j--)
			{
				res[i]+=words[i].charAt(j);
			}
		}
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
		String palindrome[] = new String[words.length];

		String longest = "";

		for(int i=0;i<words.length;i++)
		{
		    if(words[i].equals(res[i]))
		    {
		        palindrome[i] = words[i];

		        if(palindrome[i].length() > longest.length())
		        {
		            longest = palindrome[i];
		        }
		    }
		}

		System.out.print(longest);
		ip.close();
	}

}
