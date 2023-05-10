package pack03.stackque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		// ������ ���󵵰� ����.
		// last-in-first-out(LIFO) : ���Լ��� �ڷᱸ��, �����۽� �ڷᱸ��
		// LIFO Stack push pop
		Stack<Integer> intStack = new Stack<>();
		intStack.push(10);
		intStack.push(20);
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		
		// FIFO : ���Լ��� �ڷᱸ��
		// FIFO Queue offer poll
		Queue<Integer> intQue = new LinkedList<>(); //LinkedList�� Interface ���� Queue�� ��ӹ���
		intQue.offer(10);
		intQue.offer(20);
		System.out.println(intQue.poll());
		System.out.println(intQue.poll());
		
		//DEQUE <- �������� ���� �� ������ ����
		
		
		
		
		
		
		
		
		
		
		
		
	}
}