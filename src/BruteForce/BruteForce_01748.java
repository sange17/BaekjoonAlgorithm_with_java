package BruteForce;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BruteForce_01748 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int n = Integer.parseInt(str);
		int len = 0;
		
		for(int i = 1; i <= 9; i++) {
			if(str.length() == 1) {
				len = n;
				break;
			}
			
			
		}
		
		System.out.println(len);
	}
}
