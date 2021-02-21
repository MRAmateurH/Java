package CH3_Algo;

public class Queue_tester {

	public static void main(String[] args)
	{
		Queue q1 = new Queue(10);
		
		System.out.println("---q1 Display---");
		
		q1.queueDisplay();

		System.out.println();
		
		System.out.println("---q1 Enqueue---");
		
		q1.Enqueue(1);
		q1.Enqueue(5);
		q1.Enqueue(8);
		q1.Enqueue(9);
		q1.Enqueue(13);
		
		System.out.println();
		System.out.println();
		System.out.println("---q1 Dequeue---");
		
		
		q1.Dequeue();
		q1.Dequeue();
		
		System.out.println();
		System.out.println();
		System.out.println("---q1 Display---");
		
		q1.queueDisplay();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Queue q2 = new Queue(4);
		
		System.out.println("---q2 Enqueue---");
		
		q2.Enqueue(1);
		q2.Enqueue(5);
		q2.Enqueue(8);
		q2.Enqueue(9);
		q2.Enqueue(13);
		
		System.out.println();
		System.out.println();
		System.out.println("---q2 Dequeue---");
		
		
		q2.Dequeue();
		q2.Dequeue();
		
		System.out.println();
		System.out.println();
		System.out.println("---q2 Display---");
		
		q2.queueDisplay();
	}
}
