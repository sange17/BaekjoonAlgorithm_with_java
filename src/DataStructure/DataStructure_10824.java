package DataStructure;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DataStructure_10824 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String array[] = new String[4];
        array = br.readLine().split(" ");
        
        long a = Long.parseLong(array[0] + array[1]);
        long b = Long.parseLong(array[2] + array[3]);
        
        System.out.println(a + b);
	}
}
