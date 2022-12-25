package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_17094 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		int cnt2 = 0;
		int cntE = 0;
		for(int i = 0; i < length; i++) {
			
			if(str.charAt(i) == '2') {
				
				cnt2++;
			}else if(str.charAt(i) == 'e') {
				
				cntE++;
			}
		}
		
		if(cnt2 > cntE) {
			System.out.println(2);
		}else if(cnt2 < cntE) {
			System.out.println('e');
		}else {
			System.out.println("yee");
		}
		
		br.close();
	}
}
