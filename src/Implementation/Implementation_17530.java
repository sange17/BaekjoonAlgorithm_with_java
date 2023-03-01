package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_17530 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int value = Integer.parseInt(br.readLine());
		String status = "";
		for(int i = 1; i < N; i++) {
			
			int v = Integer.parseInt(br.readLine());
			
			if(value < v) {
				status = "N";
				break;
			}else {
				status = "S";
			}
		}
		
		System.out.println(status);
		br.close();
	}
}
