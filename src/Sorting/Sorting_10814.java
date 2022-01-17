package Sorting;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sorting_10814 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int max;
		int numTemp; 
		String nameTemp;
		
		int numArray[] = new int[n];
		String nameArray[] = new String[n];
		
		for(int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			
			numArray[i] = Integer.parseInt(str[0]);
			nameArray[i] = str[1];
		}

	    for (int i = numArray.length - 1; i >= 1 ; i--) {
	        max = i;
	        for (int j = numArray.length - 2; j >= 0; j--) {
	            if (numArray[j] > numArray[max]) {
	                max = j;
	            }
	        }
	        numTemp = numArray[max];
	        numArray[max] = numArray[i];
	        numArray[i] = numTemp;
	        nameTemp = nameArray[max];
	        nameArray[max] = nameArray[i];
	        nameArray[i] = nameTemp;
	    }
	    
	    for(int i = 0; i < n; i++) {
	    	sb.append(numArray[i]).append(" ").append(nameArray[i]).append("\n");
	    }
	    
	    System.out.println(sb);
	    br.close();
	}
}
