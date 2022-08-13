package Implementation;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implementation_11943 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int move1 = 0;		// 사과를 A -> C로 오렌지를 D -> B로 이동하는 횟수
		int move2 = 0;		// 사과를 C -> A로 오렌지를 B -> D로 이동하는 횟수
		
		st = new StringTokenizer(br.readLine(), " ");
		
		move1 = Integer.parseInt(st.nextToken());
		move2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		move2 += Integer.parseInt(st.nextToken());
		move1 += Integer.parseInt(st.nextToken());
		
		System.out.println(Math.min(move1, move2));
		
		br.close();
	}
}
