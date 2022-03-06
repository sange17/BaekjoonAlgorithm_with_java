package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_06749 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Y = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int diff = M - Y;
		
		System.out.println(M + diff);
		br.close();
	}
}
