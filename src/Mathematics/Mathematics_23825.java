package Mathematics;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Mathematics_23825 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int S = Integer.parseInt(st.nextToken()) / 2;
		int A = Integer.parseInt(st.nextToken()) / 2;
		
		if(S > A) {
			System.out.println(A);
		}else if(S < A) {
			System.out.println(S);
		}else {
			System.out.println(S);
		}
		
		br.close();
	}
}
