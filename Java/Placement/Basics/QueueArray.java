class Queue{
	int arr[];
	int capacity;
	int front,rear;
	
	Queue(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
		rear=front=-1;
	}
	
	void enqueue(int data)
	{
		if(rear==capacity-1)
		{
			System.out.println("Queue Full");
			return;
		}
		
		if(front==-1)
			front++;
		rear++;
		arr[rear]=data;
	}
	
	void display()
	{
		
		if(front==-1)
		{
			System.out.println("Queue Empty");
			return;
		}
		for(int i=front;i<=rear;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	int dequeue()
	{
		
//		if(front ==-1)
//			front++;
		
		int data=arr[front];
		front++;
		return data;
		
	}
	
	int peek()
	{
		if(front==-1)
		{
			System.out.println("Queue Empty");
			return -1;
		}
		else
			return arr[front];
	}
}
public class QueueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.peek());
	}

}
