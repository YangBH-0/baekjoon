package baekjoon_level_08;

import java.io.*;

public class Main_04 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			s = br.readLine();
			br.close();
			String[] num = s.split(" ");
			int a = Integer.parseInt(num[0]), b = Integer.parseInt(num[1]), v = Integer.parseInt(num[2]);
			if (v < a) {
				System.out.print(1);
			} else {
				v -= a;
				System.out.print((int) Math.ceil(v / (double) (a - b)) + 1);
			}
		} catch (

		IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
