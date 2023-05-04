package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_13118 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String[] array = br.readLine().split(" ");
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		boolean flag = false;
		int result = 0;
		
		for(int i = 1; i <= array.length; i++) {
			
			if(Integer.parseInt(array[i - 1]) == x) {
				
				flag = true;
				result = i;
			}
		}
		
		if(flag) {
			System.out.println(result);
		}else {
			System.out.println(0);
		}
		
		br.close();
	}
}
