package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.IOException;

public class Mathematics_02935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger a = new BigInteger(br.readLine());
		String operater = br.readLine();
		BigInteger b = new BigInteger(br.readLine());
		
		switch(operater) {
		case "*":
			System.out.println(a.multiply(b));
			break;
		case "+":
			System.out.println(a.add(b));
			break;
		}
		
		br.close();
	}
}
