package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mathematics_01212 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		String[] array = {"000", "001", "010", "011", "100", "101", "110", "111"};
		boolean flag = false;
		
		for(int i = 0; i < str.length(); i++) {
			sb.append(array[str.charAt(i) - 48]);
		}
		
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) - 48 == 0 && flag == false) {
				if(i == sb.length()-1 && sb.charAt(sb.length()-1) == '0') {
					System.out.println(0);
					break;
				}
				continue;
			}else {
				flag = true;
				System.out.print(sb.substring(i, sb.length()));
				break;
			}
			
		}
		
		br.close();
	}
}
