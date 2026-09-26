import java.util.Scanner;

public class prb35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		String words[]=str.split(" ");
		int vowels[]=new int[words.length];
		for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words[i].length();j++)
			{
			    if(words[i].charAt(j)=='a' || words[i].charAt(j)=='e' ||words[i].charAt(j)=='i' ||words[i].charAt(j)=='o' ||words[i].charAt(j)=='u')
			    	vowels[i]++;
			}
		}
		
		for(int i=0;i<vowels.length;i++)
			System.out.print(vowels[i]+" ");
		
		ip.close();
	}

}
