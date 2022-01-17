package Implementation;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Implementation_10817 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = new String[3];
		
		array = br.readLine().split(" ");
		
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);
		
		if(a > b && a > c) {
			
		}
		
		br.close();
	}
}
