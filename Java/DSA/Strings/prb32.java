import java.util.Scanner;
public class prb32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		String words[]=str.split(" ");
		String shortest=words[0];
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length() < shortest.length())
				shortest=words[i];
		}
		
		System.out.println(shortest);
		ip.close();
	}

}
