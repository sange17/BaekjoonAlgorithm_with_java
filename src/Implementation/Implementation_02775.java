package Implementation;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Implementation_02775 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());
			
			sb.append(x).append("\n");
			sb.append(y).append("\n");
		}
		System.out.print(sb);
	}
}
