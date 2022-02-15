package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DynamicProgramming_11053 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		int max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num > max)
			{
				max = num;
				count++;
			}
		}
		System.out.println(count);
		br.close();
	}
}
