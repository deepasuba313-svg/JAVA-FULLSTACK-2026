
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {45,78,63,112,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}

}
