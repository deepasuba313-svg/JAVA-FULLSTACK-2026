import java.util.Scanner;

public class prb37 {

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
		int count=0;

		for(int i=0;i<words.length;i++)
		{
		    if(words[i].equals(res[i]))
		    {
		       count++;
		    }
		}
		System.out.print(count);
		ip.close();
	}

}
