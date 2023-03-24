package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class String_01357 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuffer sb;
		
		String X = st.nextToken();
		sb = new StringBuffer(X);
		String reX = sb.reverse().toString();
		
		String Y = st.nextToken();
		sb = new StringBuffer(Y);
		String reY = sb.reverse().toString();
		
		int sum = Integer.parseInt(reX) + Integer.parseInt(reY);
		sb = new StringBuffer(Integer.toString(sum));
		
		String reXY = sb.reverse().toString();
		
		sum = Integer.parseInt(reXY) + 0;
		
		System.out.println(sum);
		br.close();
	}	
}
