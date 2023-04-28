package Implementation;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Implementation_01284 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int strLength = 0;
		char num;
		while(true) {
			
			str = br.readLine();
			strLength = str.length();
			int sum = 0;
			
			if(str.equals("0")) break;
			
			for(int i = 0; i < strLength; i++) {
				
				num = str.charAt(i);
				
				if(num == '1') {
					
					sum += 2;
				}else if(num == '0') {
					
					sum += 4;
				}else {
					
					sum += 3;
				}
			}
			
			sum += (strLength - 1 + 2);
			
			System.out.println(sum);
		}
		
	}
}
