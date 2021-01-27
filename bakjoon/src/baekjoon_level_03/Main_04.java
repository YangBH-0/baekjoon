package baekjoon_level_03;

import java.io.*;
public class Main_04 {
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, a, b;
		try {
			n = Integer.parseInt(br.readLine());
			String s;
			String[] strarr;
			for(int i=0;i<n;i++) {
				s=br.readLine();
				strarr=s.split(" ");
				a=Integer.parseInt(strarr[0]);
				b=Integer.parseInt(strarr[1]);
				bw.write(a+b+"\n");
			}

			bw.flush();
			br.close();
			bw.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
