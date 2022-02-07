package BruteForce;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BruteForce_01436 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		
		int shom = 666;
		while(count != n) {
			shom++;
			if(String.valueOf(shom).contains("666")) count++;
		}
		System.out.println(shom);
		br.close();
	}
}
