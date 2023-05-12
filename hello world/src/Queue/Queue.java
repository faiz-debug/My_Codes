package Queue;

public class Queue {
     private int[] data;
     private int front;
     private int size;
    
     public Queue() {
    	 this.data = new int[5]; // if user does not give size use an array of 5 element
    	 this.front = 0;
    	 this.size =0;
     }
     public Queue(int size) {
    	 this.data = new int[size];  // if user gives size make array of that size to store elements
    	 this.front = 0;
    	 this.size =0;
     }
     public void enqueue(int val) {
    	 if(this.size==this.data.length)
    	 {
    		 throw new Exception("Que full hai be");
    	 }
    	 int idx = this.front + this.size;
    	 front = front % this.data.length;
    	 data[idx] = val;
    	 size++;
     }
     public int dequeue() {
    	 int temp =this.data[front];
    	 data[front]=0;
    	 front=front+1;
    	 size--;
    	 return temp; 
     }
     public boolean isEmpty() {
    	 return this.size==0;
     }
}
