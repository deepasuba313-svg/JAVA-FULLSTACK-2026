public class linearserach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {21,45,85,66,47};
		int target=45;
		int result=linear(arr,target);
		System.out.print(result);
		
	}
	

	private static int linear(int arr[],int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
				return i;
			
		}
		return -1;
	}

}
