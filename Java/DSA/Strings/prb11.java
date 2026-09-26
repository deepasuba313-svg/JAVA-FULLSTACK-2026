import java.util.Scanner;
public class prb11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		int left=0;
		int right=str.length()-1;
		char temp='0';
		char[] arr = str.toCharArray();
		while(left<=right)
		{
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;			
		}
		System.out.print(arr);
		ip.close();
	}

}
