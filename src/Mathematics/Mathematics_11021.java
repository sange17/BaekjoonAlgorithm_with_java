package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Mathematics_11021 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write("Case #" + i + ": " +(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) +"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

