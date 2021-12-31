package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mathematics_10757 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = br.readLine().split(" ");
		
		long sum = Integer.parseInt(array[0]) + Integer.parseInt(array[1]);
		
		System.out.println(sum);
	}
}
