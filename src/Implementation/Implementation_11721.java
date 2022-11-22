package Implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Implementation_11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = sc.next();
		int strLength = str.length();
		int count = 0;
		
		Queue<Character> queue = new LinkedList<Character>();
		
		for(int i = 0; i < strLength; i++) {
			queue.add(str.charAt(i));
		}
		
		int i = 1;
		while(!queue.isEmpty()) {
			
			sb.append(queue.poll());
			
			if(i == 10) {
				sb.append("\n");
				i = 0;
			}
			
			i++;
		}
		
		System.out.println(sb.toString());
		sc.close();
	}
}
