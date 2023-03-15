package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_02592 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] array = new int[1000];
		
		int num = 0;
		int max = 0;
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			
			num = Integer.parseInt(br.readLine());
			
			array[num]++;
			
			if(max < array[num]) {
				max = array[num];
			}
			
			sum += num;
		}
		
		sb.append(sum / 10 + "\n");
		
		for(int i = 0; i < 1000; i += 10) {
			
			if(array[i] == max) {
				sb.append(i);
				break;
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
