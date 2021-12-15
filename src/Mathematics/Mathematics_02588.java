package Mathematics;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Mathematics_02588 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int sum = x + y;
		
		System.out.println(sum);
	}
}
