package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Mathematics_05532 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		
		int study = Math.max(A / C, B / D);

		if(study == A / C && A % C > 0) {
			System.out.println(L - study - 1);
		}else if(study == B / D && B % D > 0) {
			System.out.println(L - study - 1);
		}else {
			System.out.println(L - study);
		}
		br.close();
	}
}
