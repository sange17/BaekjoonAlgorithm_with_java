package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_02010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int holes = 0;
		int hole = 0;
		holes = Integer.parseInt(br.readLine());
		for(int i = 0; i < N - 1; i++) {
			
			hole = Integer.parseInt(br.readLine());
			
			holes += (hole - 1);
		}
		
		System.out.println(holes);
		br.close();
	}
}
