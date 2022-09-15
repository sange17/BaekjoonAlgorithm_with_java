package Implementation;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Implementation_17388 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int minIdx = 0;
		for(int i = 1; i <= 3; i++) {
			int joinPercent = Integer.parseInt(st.nextToken());
			
			if(min > joinPercent) {
				min = joinPercent;
				minIdx = i;
			}
			
			sum += joinPercent;
		}
		
		if(sum < 100) {
			if(minIdx == 1) System.out.println("Soongsil");
			if(minIdx == 2) System.out.println("Korea");
			if(minIdx == 3) System.out.println("Hanyang");
		}else {
			System.out.println("OK");
		}
	}
}
