package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class DataStructure_01655 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		int num = 0;
		int temp = 0;
		for(int i = 1; i <= N; i++) {
			
			num = Integer.parseInt(br.readLine());
			
			pQueue.offer(num);
			
			if(i < 3) {
				pQueue.offer(num);
				sb.append(sb.append(pQueue.peek()) + "\n");				
			}else if(i == 3){
				
				pQueue.offer(num);
				
				
			}
		}
		
		System.out.println(pQueue);

		br.close();
	}
}
