package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mathematics_11104 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] array = new int[24];
		int num = 1;
		
		for(int i = 23; i >= 0; i--) {
			
			array[i] = num;
			
			num *= 2;
		}
		
		int n = Integer.parseInt(br.readLine());
		
		String binaryStr = "";
		int sum = 0;
		for(int i = 0; i < n; i++) {
			
			binaryStr = br.readLine();
			
			for(int j = 23; j >= 0; j--) {
				
				if(binaryStr.charAt(j) == '1') {
					
					sum += array[j];
				}
			}
			
			sb.append(sum + "\n");
			
			sum = 0;
		}
		
		System.out.println(sb);
		br.close();
	}
}
