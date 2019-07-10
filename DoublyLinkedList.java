class Node{
	int data;

	Node next;
	Node previous;

	public Node(int data, Node previous)
		{
			this.data = data;
			this.next=null;
			this.previous=previous;
		}
}

class LinkedList{

	Node start;

	public LinkedList(int data)
		{
			this.start = new Node(data, null);
		}

	public void addData(int data)
		{
			Node pointer = this.start;
			while(pointer.next!=null)
				{
					pointer = pointer.next;
				}
			pointer.next = new Node(data, pointer);
		}

	public void delete(int data)
		{
			Node pointer = this.start;
			Node prePointer = null;
			Node postPointer = null;
			while(pointer.data!=data)
				{
					prePointer = pointer;
					pointer = pointer.next;
				}
			postPointer = pointer.next;

			prePointer.next = pointer.next;
			postPointer.previous = pointer.previous;
			pointer=null;
		}

	public void traverse()
		{
			Node pointer = this.start;
			while(pointer!=null)
				{
					System.out.println(pointer.data);
					pointer = pointer.next;
				}				
		}

	public void traverseBack()
		{
			Node pointer = this.start;
			while(pointer.next!=null)
				{
					pointer = pointer.next;
				}			
			while(pointer!=null)
				{
					System.out.println(pointer.data);
					pointer = pointer.previous;
				}
		}
}

class DoublyLinkedListMain{
	
	public static void main(String[] args)
		{
			LinkedList myLL = new LinkedList(1);
			myLL.addData(2);
			myLL.addData(3);
			myLL.addData(4);
			myLL.addData(5);
			myLL.traverse();
			myLL.delete(3);
			myLL.traverseBack();
		}
}