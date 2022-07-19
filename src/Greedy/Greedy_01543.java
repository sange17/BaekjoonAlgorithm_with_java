package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// sentence와 word의 첫글자가 같을 경우 겹치는 첫 위치부터 
// word 길이만큼 substring으로 잘라서 비교하여 count한 문제.
public class Greedy_01543 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String sentence = br.readLine();
		String word = br.readLine();
		int count = 0;
		
		for(int i = 0; i < sentence.length(); i++) {
			// sentence 길이를 넘어설 경우 반복 중지
			if(i + word.length() > sentence.length()) {
				break;
			}
			
			if(sentence.charAt(i) == word.charAt(0)) {
				if(sentence.substring(i, word.length() + i).equals(word)) {
					count++;
					// 반복문이 끝날 때 i++를 해주므로 +1이 한번 더 되지 않게 한다.
					i += word.length() - 1;
				}
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
