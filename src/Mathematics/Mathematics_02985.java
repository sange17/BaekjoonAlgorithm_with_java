package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_02985 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		boolean resultCheck = true;
		
		if(a + b == c) {
			System.out.println(a + "+" + b + "=" + c);
			resultCheck = false;
		}else if(a - b == c) {
			System.out.println(a + "-" + b + "=" + c);
			resultCheck = false;
		}else if(a * b == c) {
			System.out.println(a + "*" + b + "=" + c);
			resultCheck = false;
		}else if(a / b == c) {
			System.out.println(a + "/" + b + "=" + c);
			resultCheck = false;
		}
		
		if(resultCheck) {
			if(b + c == a) {
				System.out.println(a + "=" + b + "+" + c);
			}else if(b - c == a) {
				System.out.println(a + "=" + b + "-" + c);
			}else if(b * c == a) {
				System.out.println(a + "=" + b + "*" + c);
			}else if(b / c == a) {
				System.out.println(a + "=" + b + "/" + c);
			}			
		}
		
		br.close();
	}
}
