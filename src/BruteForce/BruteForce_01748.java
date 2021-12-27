package BruteForce;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BruteForce_01748 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int len = 0;
					
		if(n / 100000001 > 0) {
			len += 9;
			n -= 100000000;
		}else if(n / 10000001 > 0) {
			len += n / 10000000 * 10000000;
			n -= n / 10000000 * 10000000;
		}else if(n / 1000001 > 0) {
			len += n / 1000000 * 1000000;
			n -= n / 1000000 * 1000000;
		}else if(n / 100001 > 0) {
			len += n / 100000 * 100000;
			n -= n / 100000 * 100000;
		}else if(n / 10001 > 0) {
			len += n / 10000 * 10000;
			n -= n / 10000 * 10000;
		}else if(n / 1001 > 0) {
			len += n / 1000 * 1000;
			n -= n / 1000 * 1000;
		}else if(n / 101 > 0) {
			len += n / 100 * 100;
			n -= n / 100 * 100;
		}else if(n / 11 > 0) {
			len += (n / 10 * 2) * (n % 10 + 1) + 9;
			n -= n / 10 * 10;
		}else if(n / 1 > 0) {
			len += n / 1;
			n -= n / 1;
		}
		
		
		System.out.println(len);
	}
}
