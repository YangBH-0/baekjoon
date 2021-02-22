package baekjoon_level_12;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Main_02 {
	
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		StringBuilder sb= new StringBuilder();
		int n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			arr.add(sc.nextInt());
		
		Collections.sort(arr);
		
		for(int i=0;i<arr.size();i++) {
			sb.append(arr.get(i)).append('\n');
		}
		System.out.println(sb);
	}
}
