package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_02908 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String [] array = str.split(" ");
		int fir = Integer.parseInt(array[0]);
		int sec = Integer.parseInt(array[1]);
		
		int fir100 = fir / 100;
		fir -= fir100 * 100;
		int fir10 = fir / 10;
		fir -= fir10 * 10;
		int fir1 = fir;
		
		int sec100 = sec / 100;
		sec -= sec100 * 100;
		int sec10 = sec / 10;
		sec -= sec10 * 10;
		int sec1 = sec;
		
		if(fir1 < sec1) {
			System.out.println(getNum(sec1, sec10, sec100));
		}else if(fir1 > sec1) {
			System.out.println(getNum(fir1, fir10, fir100));
		}else if(fir1 == sec1 && fir10 < sec10) {
			System.out.println(getNum(sec1, sec10, sec100));
		}else if(fir1 == sec1 && fir10 > sec10) {
			System.out.println(getNum(fir1, fir10, fir100));
		}else if(fir1 == sec1 && fir10 == sec10 && fir100 < sec100) {
			System.out.println(getNum(sec1, sec10, sec100));
		}else if(fir1 == sec1 && fir10 == sec10 && fir100 > sec100) {
			System.out.println(getNum(fir1, fir10, fir100));
		}
	}
	
	public static int getNum(int a, int b, int c) {
		String str;
		StringBuilder sb = new StringBuilder();
		sb = sb.append(a);
		sb = sb.append(b);
		sb = sb.append(c);
		str = sb.toString();
		
		return Integer.parseInt(str);
	}
}
