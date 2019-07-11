import java.util.*;
import java.lang.*;

class Stack implements Cloneable{

	List<Integer> stack;

	public Stack()
		{
			this.stack = new ArrayList<>();
		}
	public int pop()
		{
			if(this.stack.size()<=0)	return -1;
			int ele = peek();
			this.stack.remove(stack.size()-1);
			return ele;
		}
	public int peek()
		{
			if(this.stack.size()<=0)	return -1;
			return this.stack.get(stack.size()-1);	
		}
	public int push(int num)
		{
			this.stack.add(num);
			return this.stack.size();
		}

	@Override
	public Object clone()	throws CloneNotSupportedException{
		Stack stackObj = (Stack) super.clone();
		stackObj.stack = new ArrayList<>();
		return super.clone();
	}

}

class StackOperations{

	public static List<Integer> reverse(Stack stackObj, Stack reverseStackObj)
		{
			if(stackObj.stack.size()<=0)	return	reverseStackObj.stack;
			else{
				reverseStackObj.push(stackObj.pop());
				return reverse(stackObj, reverseStackObj);
			}
		}

	public static List<Integer> sort(Stack stackObj)
		{
			Stack newStack = new Stack();
			while(stackObj.stack.size()>0)
				{
					if(stackObj.peek()>=newStack.peek())
						{
							newStack.push(stackObj.pop());
						}
					else
						{
							int x = stackObj.pop();
							while(x<newStack.peek())
								{
									stackObj.push(newStack.pop());
								}
							newStack.push(x);
						}
				}
			return newStack.stack;
		}
}
class StackMain{

	public static void main(String[] args)	throws CloneNotSupportedException
		{
			Stack stackObj = new Stack();
			stackObj.push(8);
			System.out.println("Push " + stackObj.stack);
			stackObj.push(2);
			System.out.println("Push" + stackObj.stack);
			stackObj.push(6);
			System.out.println("Push" + stackObj.stack);
			stackObj.pop();
			System.out.println("Pop" + stackObj.stack);
			stackObj.push(5);
			System.out.println("Push" + stackObj.stack);

			stackObj.push(3);
			System.out.println("Push" + stackObj.stack);

			stackObj.push(1);
			System.out.println("Push" + stackObj.stack);


			System.out.println("Sorted" + StackOperations.sort((Stack)stackObj.clone()));

			System.out.println("Reverse" + StackOperations.reverse((Stack)stackObj.clone(), new Stack()));

		}
/*
	public String infixToPostfix(String infix)
		{
			String postfix= "";

			for(int index=0; index<infix.length(); index++)
				{
					
				}

			return postfix;
		}
*/		
}

//100 200 + 10 3 - / 10 *