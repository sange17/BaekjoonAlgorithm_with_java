package Mathematics;

import java.io.*;
import java.util.*;

public class Mathematics_01712 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if (c - b == 0) {  //분모가 0이면 손익분기점을 구할 수 없으므로 -1 출력
            System.out.print(-1);
            return;
        }
        int x = a / (c - b);
        if (x < 0) {
            System.out.print(-1);
        } else {
            System.out.print(x + 1);
        }
    }
}
