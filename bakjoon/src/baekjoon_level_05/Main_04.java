package baekjoon_level_05;

import java.util.Scanner;
public class Main_04 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[10];
		int result=1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt()%42;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					break;
				
				if(j==arr.length-1)
					result++;
			}
		}
		System.out.println(result);
	}
}
