package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataStructure_05430 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			String[] pArray = br.readLine().split("");
			
			int m = Integer.parseInt(br.readLine());
			
			String str = br.readLine();
			String[] xArray = new String[m];
			str = str.replace("[", "");
			str = str.replace("]", "");
			
			sb.append("[");
			int count = 0;
			if(m < 2) {
				for(int j = 0; j < pArray.length; j++) {
					if(pArray[j] == "D") {
						count += 1;
					}
				}
				
				System.out.println(count);
				
				if(count < 1) {
					
				}else if(count == 1 && m == 1) {
					sb.append("[]").append("\n");
				}else{
					System.out.println("error");
				}
				
			}else {	
				xArray = str.split(",");
				
				for(int j = 0; j < m; j++) {
//					System.out.println(xArray.length);
				}
			}
			sb.append("]");
			System.out.println(sb);
		}
		
	}
}
