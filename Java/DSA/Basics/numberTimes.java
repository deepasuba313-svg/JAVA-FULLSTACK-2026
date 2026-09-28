public class numberTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {21,45,85,66,47,21};
		int target=21;
		int result=linear(arr,target);
		System.out.print(result);
	}
	

	private static int linear(int arr[],int target)
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
				res++;
			
			
		}
		return res;
	}

}
