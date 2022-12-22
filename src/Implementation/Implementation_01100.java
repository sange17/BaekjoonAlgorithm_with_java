package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_01100 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] array = new int[8][8];
		
		String str = "";
		for(int i = 0; i < 8; i++) {
			
			str = br.readLine();
			for(int j = 0; j < 8; j++) {
				
				array[i][j] = str.charAt(j);
			}
		}
		
		int count = 0;
		for(int i = 0; i < 8; i++) {
			
			for(int j = 0; j < 8; j++) {
				
				if((i + 2) % 2 == 0 && (j + 2) % 2 == 0 && array[i][j] == 'F') {
					count++;
				}
				
				if((i + 2) % 2 != 0 && (j + 2) % 2 != 0 && array[i][j] == 'F') {
					count++;
				}
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
