import java.util.*;

public class Arrayinsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		int arr[]=new int[10];
		int n=5;
		for(int i=0;i<n;i++)
			arr[i]=ip.nextInt();
		int ele=12;
		int pos=2;
		for(int i=n-1;i>=pos-1;i--)
		{
			arr[i+1]=arr[i];
			
		}
		arr[pos-1]=ele;
		for(int i=0;i<n+1;i++)
			System.out.print(arr[i]+" ");
	}

}
