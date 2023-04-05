package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_04806 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		String str = "";
		while((str = br.readLine()) != null && str.length() != 0) {
			
			count++;
		}
		
		System.out.println(count);
		br.close();
	}
}
