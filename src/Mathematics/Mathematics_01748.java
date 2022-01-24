package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Mathematics_01748 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int len = 0;
		int one = 9 * 1;
		int two = 90 * 2;
		int three = 900 * 3;
		int four = 9000 * 4;
		int five = 90000 * 5;
		int six = 900000 * 6;
		int seven = 9000000 * 7;
		int eight = 90000000 * 8;
		
		if(n < 10) {
			len = n;
			System.out.println(len);
		}else if(n < 100 && n >= 10) {
			len += one;
			len += (n - 10 + 1) * 2;
			System.out.println(len);
		}else if(n < 1000 && n >= 100) {
			len += one + two;
			len += (n - 100 + 1) * 3;
			System.out.println(len);
		}else if(n < 10000 && n >= 1000) {
			len += one + two + three;
			len += (n - 1000 + 1) * 4;
			System.out.println(len);
		}else if(n < 100000 && n >= 10000) {
			len += one + two + three + four;
			len += (n - 10000 + 1) * 5;
			System.out.println(len);
		}else if(n < 1000000 && n >= 100000) {
			len += one + two + three + four + five;
			len += (n - 100000 + 1) * 6;
			System.out.println(len);
		}else if(n < 10000000 && n >= 1000000) {
			len += one + two + three + four + five + six;
			len += (n - 1000000 + 1) * 7;
			System.out.println(len);
		}else if(n < 100000000 && n >= 10000000) {
			len += one + two + three + four + five + six + seven;
			len += (n - 10000000 + 1) * 8;
			System.out.println(len);
		}else {
			len += one + two + three + four + five + six + seven + eight;
			len += 9;
			System.out.println(len);
		}
	}
}
