package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_02914 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());		// °îÀÇ °³¼ö
		int I = Integer.parseInt(st.nextToken());		// ¿Ã¸² ÇÑ Æò±Õ°ª
		int AI = A * (I - 1) + 1;
		
		System.out.print(AI);
		br.close();
	}
}
