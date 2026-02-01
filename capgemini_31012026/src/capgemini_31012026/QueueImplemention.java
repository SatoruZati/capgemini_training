package capgemini_31012026;

public class QueueImplemention {

	int capacity;
	int queueArr[];
	int front = 0;
	int rear = -1;

	// constructor
	public QueueImplemention(int size) {
		this.capacity = size;
		queueArr = new int[this.capacity];
		front = 0;
		rear = -1;
	}

	public static void main(String[] args) {
		// Queue Implementation using Queue Interface
		QueueImplemention queue = new QueueImplemention(5);
		queue.enqueue(17);
		queue.enqueue(12);
		queue.enqueue(9);
		queue.enqueue(10);
		queue.enqueue(48);
		queue.enqueue(25); // Queue is full
		
		queue.display();
		System.out.println();

		System.out.println("Front element is: " + queue.peek());
		System.out.println("Dequeued element is: " + queue.dequeue());
		System.out.println();
		queue.display();
		System.out.println("Front element is: " + queue.peek());
	}

	public void enqueue(int value) {
		if (rear == capacity - 1) {
			System.out.println("Queue is full");
			return;
		}
		queueArr[++rear] = value;
	}

	public int dequeue() {
		if (front > rear) {
			System.out.println("Queue is empty");
			return -1;
		}
		return queueArr[front++];
	}

	public int peek() {
		if (front > rear) {
			System.out.println("Queue is empty");
			return -1;
		}
		return queueArr[front];
	}
	
	public void display() {
		if (front > rear) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.print("Queue elements: ");
		for (int i = front; i <= rear; i++) {
			System.out.print(queueArr[i] + " ");
		}
		System.out.println();
	}
}


