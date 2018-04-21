package Output_Of_Java_Programs;

import java.util.PriorityQueue;

public class demo70 {

	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.poll()); //1
        System.out.println(q.offer(4)); //true
        q.add(1);
        q.remove(2);
        System.out.println(q.peek()); //1
        System.out.println(q); //[1,3,4]

	}

}
