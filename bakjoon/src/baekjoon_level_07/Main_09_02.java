package baekjoon_level_07;

import java.io.*;
public class Main_09_02 {
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s=br.readLine();
			String[] cro= {"c=","c-","dz=","d-","lj","nj","s=","z="};
			for(int i=0;i<cro.length;i++) {
				s=s.replaceAll(cro[i], "r");
			}
			System.out.println(s.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
