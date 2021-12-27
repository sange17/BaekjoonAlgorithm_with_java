package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Mathematics_04153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = new String[3];
		
		array = br.readLine().split(" ");
		
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);
		
		while(a+b+c > 0) {
			if((a*a)+(b*b) == c*c) {
				System.out.println("right");
			}else if((a*a)+(c*c) == b*b) {
				System.out.println("right");
			}else if((b*b)+(c*c) == a*a) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
			array = br.readLine().split(" ");
			a = Integer.parseInt(array[0]);
			b = Integer.parseInt(array[1]);
			c = Integer.parseInt(array[2]);
		}
	}
}