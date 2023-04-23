package Implementation;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Implementation_11586 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String[] array = new String[N];
		
		for(int i = 0; i < N; i++) {
			
			array[i] = br.readLine();
		}
		
		int type = Integer.parseInt(br.readLine());
		
		if(type == 1) {
			
			for(int i = 0; i < N; i++) {
				
				result.append(array[i] + "\n");
			}
		}else if(type == 2) {
			
			for(int i = 0; i < N; i++) {
				StringBuilder temp = new StringBuilder();
				
				temp.append(array[i]).reverse();
				
				result.append(temp + "\n");
			}
		}else if(type == 3) {
			
			for(int i = N - 1; i >= 0; i--) {
				
				result.append(array[i] + "\n");
			}
		}
		
		System.out.println(result);
		br.close();
	}
}
