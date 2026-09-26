import java.util.Scanner;
public class prb18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		String word[]=str.split(" ");
		for(int i=word.length-1;i>=0;i--)
		{
			System.out.print(word[i]);
			
			if(i !=0)
			{
				System.out.print(" ");
			}
		}
		ip.close();
	}

}
