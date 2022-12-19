package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Mathematics_02501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			
			if(N % i == 0) {
				
				queue.add(i);
			}
		}
		
		int num = 0;
		if(queue.size() < K) {
			System.out.println(0);
		}else {
			
			for(int i = 0; i < K; i++) {
				
				num = queue.poll();
			}
			
			System.out.println(num);
		}
		
		br.close();
	}
}