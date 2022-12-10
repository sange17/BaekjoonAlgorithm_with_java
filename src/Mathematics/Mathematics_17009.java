package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_17009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int score = 0;
		int appleScore = 0;
		int bananaScore = 0;
		
		for(int i = 0; i < 3; i++) {
			
			score = Integer.parseInt(br.readLine());
			
			appleScore += (score * (3 - i));
		}
		
		for(int i = 0; i < 3; i++) {
			
			score = Integer.parseInt(br.readLine());
			
			bananaScore += (score * (3 - i));
		}
		
		if(appleScore > bananaScore) {
			System.out.println("A");
		}else if(appleScore < bananaScore) {
			System.out.println("B");
		}else {
			System.out.println("T");
		}
	}
}
