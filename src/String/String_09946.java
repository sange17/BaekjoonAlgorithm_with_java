package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class String_09946 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String strA = "";
		String strB = "";
		char[] arrayA;
		char[] arrayB;
		int arrayALength = 0;
		int arrayBLength = 0;
		boolean sameCheck;
		int idx = 1;
		while(true) {
			
			strA = br.readLine();
			strB = br.readLine();
			
			if(strA.equals("END") && strB.equals("END")) {
				System.out.println(sb);
				br.close();
				break;
			}
			
			arrayA = strA.toCharArray();
			arrayB = strB.toCharArray();
			arrayALength = arrayA.length;
			arrayBLength = arrayB.length;
			
			Arrays.sort(arrayA);
			Arrays.sort(arrayB);
			
			if(arrayALength != arrayBLength) {
				
				sb.append("Case " + idx + ": different\n");
			}else {
				
				sameCheck = true;
				for(int i = 0; i < Math.max(arrayALength, arrayBLength); i++) {
					
					if(arrayA[i] != arrayB[i]) {
						
						sameCheck = false;
					}
				}
				
				if(sameCheck) {
					
					sb.append("Case " + idx + ": same\n");
				}else {
					
					sb.append("Case " + idx + ": different\n");
				}
			}		
			
			idx++;
		}
	}
}
