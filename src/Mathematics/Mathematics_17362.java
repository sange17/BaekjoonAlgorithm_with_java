package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_17362 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		int[] array = {2, 1, 2, 3, 4, 5, 4, 3};
		
		System.out.println(array[N % 8]);
	}
}


