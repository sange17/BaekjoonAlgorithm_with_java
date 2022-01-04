package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Mathematics_01271 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = br.readLine().split(" ");
		
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		
		System.out.println(a / b);
		System.out.println(a % b);
	}
}
