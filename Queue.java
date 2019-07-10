import java.util.*;

class Queue{
	
	List<Integer> queue;
	
	public Queue()
		{
			this.queue = new ArrayList<>();
		}

	public boolean enqueue(int num)
		{
			return this.queue.add(num);
		}

	public boolean dequeue()
		{
			return this.queue.remove(this.queue.get(0));
		}
}

class QueueMain{

		public static void main(String[] args)
			{
				Queue queueObj = new Queue();

				System.out.println(queueObj.queue);

				queueObj.enqueue(1);
				System.out.println(queueObj.queue);
				queueObj.enqueue(2);
				System.out.println(queueObj.queue);
				queueObj.enqueue(3);
				System.out.println(queueObj.queue);
				queueObj.dequeue();
				System.out.println(queueObj.queue);
				queueObj.dequeue();
				System.out.println(queueObj.queue);
				queueObj.enqueue(4);
				System.out.println(queueObj.queue);
				queueObj.enqueue(5);
				System.out.println(queueObj.queue);
				queueObj.dequeue();
				System.out.println(queueObj.queue);
			}

	}
	