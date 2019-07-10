class Node{
	int data;
	Node next;

	public Node(int data)
		{
			this.data = data;
			this.next=null;
		}
}

class LinkedList{

	Node start;

	public LinkedList(int data)
		{
			this.start = new Node(data);
		}

	public void addData(int data)
		{
			Node pointer = this.start;
			while(pointer.next!=null)
				{
					pointer = pointer.next;
				}
			pointer.next = new Node(data);
		}

	public void delete(int data)
		{
			Node pointer = this.start;
			Node prePointer = null;

			while(pointer.data!=data)
				{
					prePointer = pointer;
					pointer = pointer.next;
				}
			prePointer.next = pointer.next;
			pointer=null;
		}

	public void traverse()
		{
			Node pointer = this.start;
			do
				{
					System.out.println(pointer.data);
					pointer = pointer.next;
				}	while(pointer!=null);			
		}
}

class LinkedListMain{
	
	public static void main(String[] args)
		{
			LinkedList myLL = new LinkedList(1);
			myLL.addData(2);
			myLL.addData(3);
			myLL.addData(4);
			myLL.addData(5);
			myLL.traverse();
			myLL.delete(3);
			myLL.traverse();
		}
}