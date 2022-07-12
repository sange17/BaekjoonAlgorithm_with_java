package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DataStructure_01544 {
	public static void main(String[] args) throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<String>[] wordList = new ArrayList[N];
		
		int resultWordCount = 0;
		
		for(int i = 0; i < N; i++) {
			
			wordList[i] = new ArrayList<>();
			
			String word = br.readLine();
			
			for(int j = 0; j < word.length(); j++) {
				wordList[i].add(word.substring(j) + word.substring(0, j));
			}
						
			boolean check = true;
			for(int j = 0; check && j <= i - 1; j++) {
				for(int k = 0; check && k < wordList[j].size(); k++) {
					if(word.equals(wordList[j].get(k))) 
						check = false;
				}
			}
			
			if(check)
				resultWordCount++;
		}
		
		System.out.println(resultWordCount);
		br.close();
		
		
	}
}
