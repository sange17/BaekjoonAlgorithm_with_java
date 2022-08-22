package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DataStructure_11478 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		HashSet<String> set = new HashSet<String>();
		
		String part = "";
		
		for(int i = 0; i < str.length(); i++) {
			part = "";
			
			for(int j = i; j < str.length(); j++) {
				part += str.substring(j, j+1);
				set.add(part);
			}
		}
		
		System.out.println(set.size());
		br.close();
	}
}
