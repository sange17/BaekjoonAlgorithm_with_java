package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_10833 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int students = 0;
		int apples = 0;
		int count = 0;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			students = Integer.parseInt(st.nextToken());
			apples = Integer.parseInt(st.nextToken());
			
			if(students > apples) {
				count += apples;
			}else {
				count += (apples % students);
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
