package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_14038 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int winCount = 0;
		
		String result = "";
		for(int i = 0; i < 6; i++) {
			
			result = br.readLine();
			
			if(result.equals("W")) {
				
				winCount++;
			}
		}
		
		if(winCount == 5 || winCount == 6) {
			System.out.println(1);
		}else if(winCount == 3 || winCount == 4) {
			System.out.println(2);
		}else if(winCount == 1 || winCount == 2){
			System.out.println(3);
		}else {
			System.out.println(-1);
		}
		
		br.close();
	}
}
