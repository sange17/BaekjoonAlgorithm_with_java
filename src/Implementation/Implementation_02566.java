package Implementation;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_02566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int max = 0;
		int x = 0;
		int y = 0;
		int num = 0;
		for(int i = 1; i <= 9; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j <= 9; j++) {
				
				num = Integer.parseInt(st.nextToken());
				
				if(max <= num) {
					max = num;
					x = i;
					y = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(x + " " + y);
		
		br.close();
	}
}
