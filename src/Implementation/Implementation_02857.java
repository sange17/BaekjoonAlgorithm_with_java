package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_02857 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		int count = 0;
		for(int i = 1; i <= 5; i++) {
			
			str = br.readLine();
			
			if(str.contains("FBI")) {
				sb.append(i + " ");
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("HE GOT AWAY!");
		}else {
			System.out.println(sb);			
		}
		br.close();
	}
}
