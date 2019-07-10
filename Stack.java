import java.util.*;

class Stack{

	int top = -1;
	List<Integer> stack;

	public Stack()
		{
			this.stack = new ArrayList<>();
		}
	public int pop()
		{
			if(this.stack.size()<=0)	return -1;
			this.stack.remove(this.stack.get(top));
			top--;
			return this.stack.size();
		}
	public int peek()
		{
			if(this.stack.size()<=0)	return -1;
			return this.stack.get(top);	
		}
	public int push(int num)
		{
			this.stack.add(num);
			top++;
			return this.stack.size();
		}
}

class Main{

	public static void main(String[] args)
		{
			Stack stackObj = new Stack();
			stackObj.push(1);
			System.out.println("Push " + stackObj.stack);
			stackObj.push(2);
			System.out.println("Push" + stackObj.stack);
			stackObj.push(3);
			System.out.println("Push" + stackObj.stack);
			stackObj.pop();
			System.out.println("Pop" + stackObj.stack);
			stackObj.peek();
			System.out.println("Peek" + stackObj.stack);
		}

	public String infixToPostfix(String infix)
		{
			String postfix= "";

			for(int index=0; index<infix.length(); index++)
				{
					
				}

			return postfix;
		}
		
}

//100 200 + 10 3 - / 10 *