package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_10823 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		String tempStr = "";
		while((str = br.readLine()) != null && str.length() != 0) {
			
			tempStr += str;
		}
		
		st = new StringTokenizer(tempStr, ",");
		
		int sum = 0;
		while(st.hasMoreTokens()) {
			
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum);
		br.close();
	}
}
