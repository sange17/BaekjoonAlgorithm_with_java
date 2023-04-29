package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Implementation_06840 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[3];
		
		for(int i = 0; i < 3; i++) {
			
			array[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(array);
		
		System.out.println(array[1]);
		br.close();
	}
}
