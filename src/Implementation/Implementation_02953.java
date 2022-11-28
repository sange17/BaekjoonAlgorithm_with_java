package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_02953 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int sum = 0;
		int num = 0;
		int max = 0;
		for(int i = 1; i <= 5; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < 4; j++) {
				
				sum += Integer.parseInt(st.nextToken());
			}
			
			if(max < sum) {
				max = sum;
				num = i;
			}
			
			sum = 0;
		}
		
		System.out.println(num + " " + max);
		br.close();
	}
}
