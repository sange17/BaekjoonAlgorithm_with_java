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
		BigInteger CHECK = new BigInteger("2");
		BigInteger ODD = new BigInteger("1");
		BigInteger EVEN = new BigInteger("0");
		
		if(ODD.compareTo(ALL.remainder(CHECK)) == 0 && ODD.compareTo(MORE.remainder(CHECK)) == 0) {
			System.out.println(ALL.divide(CHECK).add(MORE.divide(CHECK).add(ODD)));
			System.out.println(ALL.divide(CHECK).subtract(MORE.divide(CHECK)));
		}else if(EVEN.compareTo(ALL.remainder(CHECK)) == 0 && EVEN.compareTo(MORE.remainder(CHECK)) == 0) {
			System.out.println(ALL.divide(CHECK).add(MORE.divide(CHECK)));
			System.out.println(ALL.divide(CHECK).subtract(MORE.divide(CHECK)));
		}
		
		br.close();
	}
}
