
public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3,1,5,2};
		sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) //length is the non-static variable, a method will be considered when it has ()
		{
			int max=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[max]>arr[j])
					max=j;
			}
			if(max!=i)
			{
				int temp=arr[i];
				arr[i]=arr[max];
				arr[max]=temp;
			}
		}
	}

}
