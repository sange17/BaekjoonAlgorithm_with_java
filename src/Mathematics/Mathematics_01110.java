package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mathematics_01110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		String firststr;
		String secondstr;
		String [] beforestrArray;
		String [] afterstrArray;
		int cycle=0;
		
		firststr = br.readLine();
		secondstr = firststr;
		
		while(true) {			
			if(secondstr.length() < 2) {
				secondstr = "0" + secondstr;
			}
			
			beforestrArray = secondstr.split("");
			String a = beforestrArray[1];
			
			// 0 + 0 = 0
			int sum = Integer.parseInt(beforestrArray[0]) + Integer.parseInt(beforestrArray[1]);
			
			String strsum = Integer.toString(sum);
			if(strsum.length() < 2) {
				strsum = "0" + strsum;
			}
			
			afterstrArray = strsum.split("");
			String b = afterstrArray[1];
			
			str = a + b;
			cycle += 1;
			
			if(Integer.parseInt(firststr)==Integer.parseInt(str)) {break;}
			
			secondstr = str;			
		}
		System.out.println(cycle);
	}
}
