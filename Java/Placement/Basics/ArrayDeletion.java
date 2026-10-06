import java.util.Scanner;

public class ArrayDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		int arr[]=new int[10];
		int n=5;
		for(int i=0;i<n;i++)
			arr[i]=ip.nextInt();
		//int ele=12;
		int pos=2;
		for(int i=pos-1;i<n-1;i++)
		{
			arr[i]=arr[i+1];
			
		}
		for(int i=0;i<n-1;i++)
			System.out.print(arr[i]+" ");
	}

}
