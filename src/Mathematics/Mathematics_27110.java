package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_27110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int chicken = 0;
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			
			chicken = Integer.parseInt(st.nextToken());
			
			if(N >= chicken) {
				sum += chicken;
			}else {
				sum += N;
			}
		}
		
		System.out.println(sum);
		br.close();
		
	}
}
