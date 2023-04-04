package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_10769 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int strLength = str.length();
		
		int happyCnt = 0;
		int sadCnt = 0;
		for(int i = 0; i < strLength - 2; i++) {
			
			if(str.charAt(i) == ':' && str.charAt(i + 1) == '-' && str.charAt(i + 2) == ')') {
				
				happyCnt++;
			}else if(str.charAt(i) == ':' && str.charAt(i + 1) == '-' && str.charAt(i + 2) == '(') {
				
				sadCnt++;
			}
		}
		
		if(happyCnt > sadCnt) {
			
			System.out.println("happy");
		}else if(happyCnt < sadCnt) {
			
			System.out.println("sad");
		}else if(happyCnt == 0 && sadCnt == 0) {
			
			System.out.println("none");
		}else {
			
			System.out.println("unsure");
		}
		
		br.close();
	}
}
