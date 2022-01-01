package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_02475 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = br.readLine().split(" ");
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += Math.pow(Integer.parseInt(array[i]), 2);
		}
		
		System.out.println(sum % 10);
	}
}
