class StackClass{
	int arr[];
	int capacity;
	int top;
	
	StackClass(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
		top=-1;
	}
	
	
	void push(int data)
	{
		if(top>=capacity)
			System.out.print("Stack overflow");
		else
		{
			top++;
			arr[top]=data;
		}
	}
	
	int pop()
	{
		return arr[top--];  
	}
	
	void display()
	{
		System.out.println();
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackClass stc=new StackClass(5);
		stc.push(10);
		stc.push(20);
		stc.push(30);
		stc.push(40);
		stc.push(50);
		stc.display();
		stc.pop();
		
		stc.push(90);
		stc.display();
	}

}
