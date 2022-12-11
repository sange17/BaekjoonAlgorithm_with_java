package Implementation;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Implementation_11549 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String T = br.readLine();
		
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 5; i++) {
			
			if(st.nextToken().equals(T)) {
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
