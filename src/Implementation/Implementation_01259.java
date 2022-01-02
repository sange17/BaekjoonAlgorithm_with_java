package Implementation;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Implementation_01259 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		while(true) {
			String str = br.readLine();
			String array[] = str.split("");
			String result = "yes";
			int count = 0;
						
			if(Integer.parseInt(array[0]) == 0) break;
			
			for(int i = 0; i <= Math.sqrt(array.length); i++) {
				int front = Integer.parseInt(array[i]);
				int back = Integer.parseInt(array[array.length - 1 - i]);
				
				if(Math.sqrt(array.length) == 1) {
					result = "yes";
					break;
				}
				
				if(front == back) {
					count++;
				}else {
					result = "no";
					break;
				}					
			}
			System.out.println(count);
			
			if(count >= Math.sqrt(array.length)) {
				System.out.println(result);
			}else {
				System.out.println(result);
			}
		}
		br.close();
	}
}
