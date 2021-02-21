package CH3_Algo;

public class Cir_Queue_tester {

	public static void main(String[] args) {
		
		Cir_Queue q1 = new Cir_Queue(4);
		
		System.out.println("---q1 display---"); 
		
		q1.queueDisplay();
		
		System.out.println();
		
		System.out.println("---q1 Enqueue---");
		
		q1.Enqueue(1);
		q1.Enqueue(3);
		q1.Enqueue(5);
		q1.Enqueue(7);
		q1.Enqueue(9);
		
		System.out.println();
		System.out.println();
		System.out.println("---q1 Dequeue---");
		
		
		q1.Dequeue();
		q1.Dequeue();
		
		System.out.println();
		System.out.println();
		System.out.println("---q1 Enqueue---");
		
		q1.Enqueue(9);
		
		System.out.println();
		System.out.println();
		System.out.println("---q1 display---");
		
		q1.queueDisplay();
	}
}
