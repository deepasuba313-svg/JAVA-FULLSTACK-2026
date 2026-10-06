class Node{
	int data;
	Node next;
}

class LinkedList{
	Node first;
	Node last;
	LinkedList()
	{
		first=last=null;
	}
	void push(int data)
	{
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		
		newNode.next=first;
		first=newNode;
	}
	int pop()
	{
	    int ele=first.data;
	    first=first.next;
	    return ele;
	}
	int peek()
	{
	    return first.data;
	}
	boolean isEmpty()
	{
	    return (first==null);
	}
	void display()
	{
		Node temp=first;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
public class Stack_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.push(10);
		l.push(20);
		l.push(30);
		l.display();
		System.out.println();
		System.out.println(l.pop());
		System.out.println(l.peek());
		System.out.println(l.isEmpty());
	}

}
