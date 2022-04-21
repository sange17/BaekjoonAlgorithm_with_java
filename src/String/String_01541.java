package String;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class String_01541 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str1 = br.readLine().split("-");
		int result = 0;
		for(int i = 0; i < str1.length; i++) {
			int sum = 0;
			String[] str2 = str1[i].split("\\+");
			for(int j = 0; j < str2.length; j++)
				sum += Integer.parseInt(str2[j]);
			if(i==0) 
				result += sum;
			else 
				result -= sum;
		}
		System.out.println(result);
	}
}
