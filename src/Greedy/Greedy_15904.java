package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Greedy_15904 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] array = {'U', 'C', 'P', 'C'};
		
		String str = br.readLine();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == array[count]) {
				count++;
			}
			
			if(count == 4) {
				System.out.println("I love UCPC");
				break;
			}
		}
	
		if(count != 4) {
			System.out.println("I hate UCPC");
		}
	}
}
