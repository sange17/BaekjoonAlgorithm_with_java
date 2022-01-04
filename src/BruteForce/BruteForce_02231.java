package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BruteForce_02231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int n = Integer.parseInt(str);
		int min = 0;
		int count = 0;
	
		for(int i = 0; i < n; i++) {
			String s = String.valueOf(i);
			String array[] = s.split("");
			int dSum = 0;
			
			for(int j = 0; j < array.length; j++) {
				dSum += Integer.parseInt(array[j]);
			}
			
			if(i + dSum == n) {
				count++;
				min = i;
				break;
			}
		}			
		
		if(count == 0) System.out.println(0);
		else System.out.println(min);
		
		br.close();
	}
}
