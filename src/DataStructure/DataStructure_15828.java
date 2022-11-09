package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.io.IOException;

// LinkedList로 구현한 Queue는 offer(), peek(), poll(), size() 모두 O(1)의 시간복잡도를 갖는다.
// PriorityQueue로 구현한 Queue는 offer()과 poll()은 O(logn)의 시간복잡도를 갖고, peek()은 O(1)의 시간복잡도를 갖는다.
public class DataStructure_15828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int num = 0;
		while(true) {
			num = Integer.parseInt(br.readLine());
			
			if(num == -1) break;
			
			if(queue.size() == N && num != 0) continue;
			
			if(num == 0) {
				if(queue.size() == 0) continue;
								
				queue.poll();
			}else {
				queue.add(num);
			}
		}
				
		if(queue.size() == 0) {
			System.out.println("empty");
		}else {
			for(int i : queue) {
				sb.append(i + " ");
			}
			
			System.out.println(sb);
		}
		
		br.close();
	}
}
