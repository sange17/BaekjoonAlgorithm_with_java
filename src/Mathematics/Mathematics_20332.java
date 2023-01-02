package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 문제 풀기 전에 자료형 범위 넘어가는지 체크해야함
public class Mathematics_20332 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		long sum = 0;
		for(int i = 0; i < N; i++) {
			
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum % N);
		
		if((sum % N) != 0) {
			
			System.out.println("no");
		}else {
			
			System.out.println("yes");
		}
		
		br.close();
	}
}
