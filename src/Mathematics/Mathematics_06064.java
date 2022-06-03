package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mathematics_06064 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;
			boolean check = false;
			
			// 최소공배수 이용한 반복문
			// i에 M씩 더하며 i가 최소공배수 크기보다 작은 경우 반복
			for(int i = x; i < (N * M); i += M) {
				// x의 값을 N으로 나눈 나머지가 y이면 끝
				if(i % N == y) {
					System.out.println(i + 1);
					check = true;
					break;
				}
			}
			
			// 최소공배수와 같거나 넘어서면 -1 출력
			if(!check) System.out.println(-1);
		}
	}
}
