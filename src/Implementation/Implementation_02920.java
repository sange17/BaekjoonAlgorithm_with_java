package Implementation;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Implementation_02920 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = br.readLine().split(" ");
		int aCount = 0;
		int dCount = 0;
		int mCount = 0;
		
		
		for(int i = 0; i < array.length; i++) {
			if(i+1 == Integer.parseInt(array[i])) {
				aCount++;
			}else if(8-i == Integer.parseInt(array[i])) {
				dCount++;
			}else {
				mCount++;
			}
		}
		
		if(aCount == 8) System.out.println("ascending");
		else if(dCount == 8) System.out.println("descending");
		else if(mCount > 0) System.out.println("mixed");
	}
}
