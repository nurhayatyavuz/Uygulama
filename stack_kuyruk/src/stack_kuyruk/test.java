package stack_kuyruk;

import java.util.LinkedList;
import java.util.Queue;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3,5,8,9,2,1,9,3 //5,8,2,1,9
		//removeAll(queue,value)
		int data []= {18,4,3,9,4,2};
		//q.add(18);
		//q.add(4)....
		Queue<Integer> q=new LinkedList<Integer>();
		for(int n:data) {
			q.add(n);
			
		}
		System.out.println("queue:"+q);
		removeAll(q,4);
		System.out.println("queue:"+q);

	}
	public static void removeAll(Queue<Integer>q,int value) {
		int size=q.size();
		for(int i =0;i<size;i++) {
			int n=q.remove();
			System.out.println(n+"eleman� cikartildi");
			System.out.println("Current queue"+q);
			if(n!=value) {
				q.add(n);
				System.out.println(n+"eleman� eklendi");
			}

		}
	}

}
