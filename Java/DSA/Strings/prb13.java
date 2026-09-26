import java.util.Scanner;
public class prb13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		String str2=str;
		int left=0;
		int right=str2.length()-1;
		boolean flag=true;
		while(left<=right)
		{
			if(Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right)))
				flag=false;
			left++;
			right--;
		}
	
		
		if(flag)
			System.out.print(true);
			
		else
			System.out.print(false);
		
		ip.close();
		}

}
