package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_09935 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String bomb = br.readLine();
		
		while(true) {
			
			if(str.contains(bomb)) {
				str = str.replace(bomb, "");
			}else {
				break;
			}
		}
		
		if(str.length() == 0) {
			System.out.println("FRULA");
		}else {
			System.out.println(str);			
		}
		br.close();
	}
}
