package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_10988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int strLength = str.length();
		int left = 0;
		int right = str.length() - 1;
		boolean check = true;
		
		for(int i = 0; i < strLength / 2; i++) {
			
			if(str.charAt(left) != str.charAt(right)) {
				
				check = false;
				break;
			}
			
			left++;
			right--;
			
			if(left > right) {
				break;
			}
		}
		
		if(check) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		br.close();
	}
}
