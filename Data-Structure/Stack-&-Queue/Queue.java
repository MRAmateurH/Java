package CH3_Algo;

public class Queue {

	protected static int front, rear, capacity;
	protected static int[] queue;
	
	public Queue(int c)
	{
		front = 0; 
		rear = 0;
		capacity = c;
		queue = new int[capacity];
	}
	
	public void Enqueue(int item)
	{
		if(rear == capacity) 
			System.out.print("Queue is full\n");
		
		else {
			queue[rear] = item;
			rear += 1;
			System.out.printf("Enqueue: %d, ", item);
		}
	}
	
	public void Dequeue()
	{
		if(front == rear)
			System.out.print("Queue is empty\n");
		
		else {
			int item = queue[front];
			front += 1;
			System.out.printf("Dequeue: %d, ", item);
		}
	}
	
	public void queueDisplay() {
		if(front == rear)
			System.out.print("Queue is empty\n");
		
		for(int i = front; i < rear; i++)
			System.out.printf("%d <-- ", queue[i]);
	}
}
