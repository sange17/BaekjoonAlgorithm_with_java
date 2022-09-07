package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_04470 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			String string = br.readLine();
			
			sb.append(i + ". " + string + "\n");
		}
		
		System.out.println(sb.toString());
	}
}
