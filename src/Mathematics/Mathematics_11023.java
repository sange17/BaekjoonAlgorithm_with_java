package Mathematics;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Mathematics_11023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st;
		
		int sum = 0;
		if(str.contains(" ")) {
			st = new StringTokenizer(str, " ");
			
			while(st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
		}else {
			
			sum = Integer.parseInt(str);
		}
		
		
		System.out.println(sum);
		sc.close();
	}
}
