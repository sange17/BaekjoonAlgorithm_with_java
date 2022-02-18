package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DataStructure_12605 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int size = st.countTokens();
			String[] array = new String[size];
			
			for(int j = 0; j < size; j++) {
				String str = st.nextToken();
				array[j] = str;
			}
			
			sb.append("Case #").append(i+1).append(": ");
			for(int j = array.length - 1; j >= 0; j--) {
				sb.append(array[j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
