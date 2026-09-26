import java.util.Scanner;
public class prb31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		String words[]=str.split(" ");
		String longest="";
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length() > longest.length())
				longest=words[i];
		}
		
		System.out.println(longest);
		ip.close();
	}

}
