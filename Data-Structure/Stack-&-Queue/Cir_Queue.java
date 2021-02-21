package CH3_Algo;

public class Cir_Queue extends Queue {

	protected static boolean tag;
	
	public Cir_Queue(int c)
	{
		super(c);
		tag = false;
	}
	
	@Override
	public void Enqueue(int item)
	{
		if(front == rear && tag == true) 
			System.out.printf("Queue is full\n");
		else {
			queue[rear] = item;
			rear = (rear+1) % capacity;
			System.out.printf("Enqueue: %d, ", item);
			if(front == rear) 
			{
				tag = true;
				return;
			}
		}
	}
	
	@Override
	public void Dequeue()
	{
		if(front == rear && tag == false)
			System.out.printf("Queue is empty\n");
		
		else {
			int item = queue[front];
			front += 1;
			System.out.printf("Dequeue: %d, ", item);
		}
	}
	
	@Override
	public void queueDisplay() {
		if(front == rear && tag == false)
			System.out.print("Queue is empty\n");
		
		else if (front < rear) {
			for(int i = front; i < rear; i++)
				System.out.printf("%d <-- ", queue[i]);
		}
		
		else {
			for(int i = front; i < queue.length; i++)
				System.out.printf("%d <-- ", queue[i]);
			
			for(int i = 0; i <= rear; i++)
				System.out.printf("%d <-- ", queue[i]);
		}
		
	}
}
