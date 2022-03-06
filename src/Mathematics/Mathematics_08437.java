package Mathematics;

import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;

public class Mathematics_08437 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger ALL = new BigInteger(br.readLine());
		BigInteger MORE = new BigInteger(br.readLine());
		BigInteger SUM = ALL.add(MORE);
		BigInteger DIV = new BigInteger("2");
		
		br.close();
	}
}
