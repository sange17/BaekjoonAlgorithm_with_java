package DataStructure;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class DataStructure_01966 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int count = 0;
			Queue<int[]> queue = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				queue.add(new int[] {j, Integer.parseInt(st.nextToken())});
			}
			
			while(true) {
				int now[] = queue.remove();
				boolean check = true;
				
				for(int q[] : queue) {
					if(q[1] > now[1]) {
						check = false;
						break;
					}
				}
				
				if(check) {
					count++;
					if(now[0] == M) break;
				}else {
					queue.add(now);
				}
			}
			System.out.println(count);
		}
		br.close();
	}
}
