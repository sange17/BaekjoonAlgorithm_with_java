package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Mathematics_02869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = br.readLine().split(" ");
		
		long day = Long.parseLong(array[0]);
		long night = Long.parseLong(array[1]);
		long height = Long.parseLong(array[2]);
		long today = day - night;
		
		long result = (height - night) / today;
		
		if((height - night) % today != 0) result++;
		
		System.out.println(result);
		br.close();
	}
}
