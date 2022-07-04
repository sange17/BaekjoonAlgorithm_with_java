package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class DataStructure_05430 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int T = Integer.parseInt(br.readLine());
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		
		for(int i = 0; i < T; i++) {
			String p = br.readLine();
			
			int n = Integer.parseInt(br.readLine());
			
			String str = br.readLine();
			
			if(n != 0) {
				str = str.replace("[", "");
				str = str.replace("]", "");
				String[] xArray = str.split(",");
				
				for(String string : xArray) {
					deque.add(Integer.parseInt(string));
				}
			}
			
			System.out.println(ac(deque, p));
		}
	}

	private static String ac(ArrayDeque<Integer> deque, String operation) {
		boolean reverse = false;
				
		for(char pChar : operation.toCharArray()) {
			if(pChar == 'R')
				reverse = !reverse;
			else {
				if(deque.size() == 0)
					return "error";
				
				if(reverse)
					deque.removeLast();
				else 
					deque.removeFirst();
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while(!deque.isEmpty()) {
			sb.append(reverse ? deque.removeLast() : deque.removeFirst());
						
			if(deque.size() != 0)
				sb.append(",");
			
		}
		sb.append("]");
		
		return sb.toString();
	}
}
