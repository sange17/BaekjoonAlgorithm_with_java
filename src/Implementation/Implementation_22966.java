package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Implementation_22966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		String str = "";
		int difficulty = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			str = st.nextToken();
			difficulty = Integer.parseInt(st.nextToken());
			
			map.put(difficulty, str);
			
			if(min > difficulty) {
				
				min = difficulty;
			}
		}
		
		System.out.println(map.get(min));
		br.close();
	}
}
