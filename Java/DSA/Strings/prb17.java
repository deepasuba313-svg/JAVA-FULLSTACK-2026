import java.util.Scanner;
public class prb17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		String word[]=str.split(" ");
		for(int i=0;i<word.length;i++)
		{
			for(int j=word[i].length()-1;j>=0;j--)
			{
				System.out.print(word[i].charAt(j));
			}
			
			if(i<word.length -1)
			{
				System.out.print(" ");
			}
		}
		ip.close();
	}

}
