package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_19944 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine() , " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M == 1 || M == 2) {
			System.out.println("NEWBIE!");
		}else if(M > 2 && M <= N) {
			System.out.println("OLDBIE!");
		}else {
			System.out.println("TLE!");
		}
	}
}
