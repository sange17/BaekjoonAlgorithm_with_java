package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Mathematics_02721 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int num = 0;
		int array[] = new int[301];
		array[0] = 1;
		for(int i = 1; i <= 300; i++) {
			
			array[i] = array[i - 1] + (i + 1);
		}
		
		for(int i = 0; i < T; i++) {
			
			int sum = 0;
			num = Integer.parseInt(br.readLine());
			
			for(int j = 1; j <= num; j++) {
				
				sum += (j * array[j]);  
			}
			
			sb.append(sum + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
