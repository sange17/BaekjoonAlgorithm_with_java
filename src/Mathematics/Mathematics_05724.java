package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_05724 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] array = new int[100];
		
		array[0] = 1;
		for(int i = 1; i < 100; i++) {
			
			array[i] = array[i - 1] + (i + 1) * (i + 1); 
		}
		
		int num = 0;
		while(true) {
			
			num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				System.out.println(sb);
				break;
			}
			
			sb.append(array[num - 1] + "\n");
		}
	}
}
