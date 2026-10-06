class Node{
	int data;
	Node next;
}
class Linklist{
	Node first;
	Node last;
	Linklist()
	{
		first=last=null;
	}
	void insert(int val)
	{
		Node newnode=new Node();
		newnode.data=val;
		newnode.next=null;
		
		if(first==null)
		{
			first=newnode;
			last=newnode;
		}
		else
		{
			last.next=newnode;
			last=newnode;
		}
	}
	void printList()
	{
		Node temp=first;
		if(first==null)
			System.out.print("Empty");
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	
	
	
}
public class LinkedList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linklist l=new Linklist();
		l.insert(11);
		l.insert(15);
		l.insert(17);
		l.printList();
	}
	

}
