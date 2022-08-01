package Implementation;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Implementation_02490 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		for(int i = 0; i < 3; i++) {
			String[] array = br.readLine().split(" ");
			
			int count = 0;
			for(int j = 0; j < 4; j++) {
				if(array[j].equals("1"))
					count++;
			}
			
			switch(count){
			case 0:
				sb.append("D" + "\n");
				break;
			case 1:
				sb.append("C" + "\n");
				break;
			case 2:
				sb.append("B" + "\n");
				break;
			case 3:
				sb.append("A" + "\n");
				break;
			case 4:
				sb.append("E" + "\n");
				break;
				
			}
		}
		
		System.out.println(sb.toString());
	}
}
