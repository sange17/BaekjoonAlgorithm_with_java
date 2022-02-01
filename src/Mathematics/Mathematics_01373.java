package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Mathematics_01373 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		if(str.length() % 3 == 1) {
			sb.append("00").append(str);
			System.out.println(sb);
		}else if(str.length() % 3 == 2) {
			sb.append("0").append(str);
			System.out.println(sb);
		}
	}
}
