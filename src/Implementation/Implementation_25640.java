package Implementation;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Implementation_25640 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String myMbti = br.readLine();
		
		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i = 0; i < N; i++) {
			String yourMbti = br.readLine();
			
			if(myMbti.equals(yourMbti)) count++;
		}
		
		System.out.println(count);
		br.close();
	}
}
