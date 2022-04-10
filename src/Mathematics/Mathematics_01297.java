package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_01297 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double result = 0;
		int diagonal = Integer.parseInt(st.nextToken());
		int width = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		
		result = Math.sqrt(Math.pow(diagonal, 2)/(Math.pow(width, 2)+Math.pow(height, 2)));
		
		System.out.println((int)(width * result) + " " + (int)(height * result));
	}
}
