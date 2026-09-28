public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,14,25,35,45,96,889,63325,789654};
		int target=45;
		int result=binary(arr,target);
		System.out.print(result);
		
	}
	

	private static int binary(int arr[],int target)
	{
		int left=0;
		int right=arr.length;
		while(left<right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]>target)
				left=mid+1;
			else
				right=mid-1;
		}
		return -1;
	}

}
