package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DataStructure_01021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LinkedList<Integer> deque = new LinkedList<Integer>();
		
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		
		for(int i = 1; i <= N; i++) {
			deque.offer(i);
		}
		
		int[] mArray = new int[M];		
		
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < M; i++) {
			mArray[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < M; i++) {
			
			int targetIdx = deque.indexOf(mArray[i]);
			int halfIdx;
			
			if(deque.size() % 2 == 0) {
				halfIdx = deque.size() / 2 - 1;
			}else {
				halfIdx = deque.size() / 2;
			}
						
			if(targetIdx <= halfIdx) {
				for(int j = 0; j < targetIdx; j++) {
					int tmp = deque.pollFirst();
					deque.offerLast(tmp);
					count++;					
				}
			}
			else {
				for(int j = 0; j < deque.size() - targetIdx; j++) {
					int tmp = deque.pollLast();
					deque.offerFirst(tmp);
					count++;					
				}
			}
			
			deque.pollFirst();
		}
		
		System.out.println(count);
		br.close();
		
	}
}
