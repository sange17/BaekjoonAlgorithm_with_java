package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mathematics_03003 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] array = {1, 1, 2, 2, 2, 8};
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < 6; i++) {
			sb.append(array[i] - Integer.parseInt(st.nextToken())).append(" ");
		}
		
		System.out.println(sb);
		br.close();
	}
}
