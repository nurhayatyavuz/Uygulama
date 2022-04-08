package stack_kuyruk;

import java.util.Stack;

public class stackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data[]= {"java","php","C","C++","phyton"};
		
		Stack<String> s=new Stack<String>();
		
		for(String word:data) {
			s.push(word);
		}
		System.out.println("Stack="+s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println("Stack="+s);
		System.out.println("------------");
		while(!s.isEmpty()) {
			System.out.println(s.pop());
			System.out.println("stack="+s);
		}
	}
	

}
