package DataStructure;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class DataStructure_01966 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;		
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int que[] = new int[N+1];
			int front = 0;
			int rear = N - 1;
			int size = N;
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j < N+1; j++) {
				if(j == M+1) {
					que[j] = Integer.parseInt(st.nextToken()) + 100;
				}else {
					que[j] = Integer.parseInt(st.nextToken());				
				}
			}
			
//			for(int j = 0; j < N; j++) {
//				System.out.println(que[j]);
//			}
			
			if(size == 1) sb.append(1).append("\n");
			
			int count = 0;
			for(int j = front + 1; j < (rear+1)%4; j++) {
				for(int k = j + 1; k < (rear+1) % 4 - 1; k++) {
					if(que[j] <= que[k]) {
						count++;
					}
				}
				if(count != 0) {
					front++;
					sb.append(que[front]).append("\n");
				}else {
					
				}
			}
			
			
			
			
		}
		System.out.println(sb);
		br.close();
	}
}
