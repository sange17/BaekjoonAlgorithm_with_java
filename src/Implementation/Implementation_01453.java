package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_01453 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] array = new int[101];
		int num = 0;
		int count = 0;
		for(int i = 0; i < N; i++) {
			
			num = Integer.parseInt(st.nextToken());
			
			if(array[num] == 0) {
								
				array[num] = num;
			}else {
				
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
	
}
