package Implementation;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Implementation_11723 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int bitset = 0;
		int num = 0;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String operation = st.nextToken();
			
			switch(operation) {
			case "add":
				num = Integer.parseInt(st.nextToken());
				bitset |= (1 << (num-1));
				break;
			case "remove":
				num = Integer.parseInt(st.nextToken());
				bitset &= ~(1 << (num-1));
				break;
			case "check":
				num = Integer.parseInt(st.nextToken());
				sb.append((bitset & (1 << (num - 1))) != 0 ? 1 : 0).append("\n");
				break;
			case "toggle":
				num = Integer.parseInt(st.nextToken());
				bitset ^= (1 << (num-1));
				break;
			case "all":
				bitset |= (~0);
				break;
			case "empty":
				bitset &= 0;
				break;
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
