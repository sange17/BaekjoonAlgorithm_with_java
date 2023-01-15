package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_02506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		int result = 0;
		int checkResult = 0;
		int resultSum = 0;
		for(int i = 0; i < N; i++) {
			
			result = Integer.parseInt(st.nextToken());
			
			if(result == 1) {
				checkResult++;
			}else {
				checkResult = 0;
			}
			
			resultSum += checkResult;
		}
		
		System.out.println(resultSum);
		br.close();
	}
}
