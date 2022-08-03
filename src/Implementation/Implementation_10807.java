package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_10807 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int v = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(v == Integer.parseInt(st.nextToken())) {
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
		
	}
}
