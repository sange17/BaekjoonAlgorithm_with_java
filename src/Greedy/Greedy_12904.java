package Greedy;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Greedy_12904 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb1 = new StringBuilder(br.readLine());
		StringBuilder sb2 = new StringBuilder(br.readLine());
		
		while(sb1.length() < sb2.length()) {
			
			if(sb2.charAt(sb2.length()-1) == 'A') {
				sb2.deleteCharAt(sb2.length()-1);
			}else if(sb2.charAt(sb2.length()-1) == 'B') {
				sb2.deleteCharAt(sb2.length()-1);
				sb2.reverse();
			}
		}
		
		if(sb1.toString().equals(sb2.toString())) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
