package Implementation;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Implementation_01157 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toUpperCase();
		char array[] = str.toCharArray();
		int count = 0;
		int max = 0;
		int result = 0;
		int same = 0;
				
		for(int i = 65; i <= 90; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[j] == i)
					count++;
			}
			
			if(max < count) {
				max = count;
				result = i;
				same = 0;
			}else if(max == count)
				same++;
			
			count = 0;
		}
		
		if(same != 0) System.out.println('?');
		else System.out.println((char)result);
	}
}
