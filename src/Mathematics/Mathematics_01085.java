package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_01085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = br.readLine().split(" ");
		
		int x = Integer.parseInt(array[0]);
		int y = Integer.parseInt(array[1]);
		int w = Integer.parseInt(array[2]);
		int h = Integer.parseInt(array[3]);
		int xmin = 0;
		int ymin = 0;
		
		if(x - 0 < w - x) {
			xmin = x - 0;
		}else {
			xmin = w - x;
		}
		
		if(y - 0 < h - y) {
			ymin = y - 0;
		}else {
			ymin = h - y;
		}
		
		System.out.println(xmin <= ymin ? xmin : ymin);
	}
}
