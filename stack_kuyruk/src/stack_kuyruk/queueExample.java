package stack_kuyruk;

import java.util.LinkedList;
import java.util.Queue;

public class queueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data[]= {"java","php","C","C++","phyton"};
		
		
		Queue<String> q=new LinkedList<String>(); 
		for(String word: data) {
			q.add(word);
			
			System.out.println("queue:"+q);
			System.out.println("peek:"+q.peek());
			System.out.println(q.size());
		}
		

	}

}
