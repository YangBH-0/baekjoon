package baekjoon_level_11;

import java.util.Scanner;
public class Main_05 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,k=666;
		int right=0,left=0,d=0;
		while(i<n) {
			if(Integer.toString(right).contains("6")) {
				left++;
				i++;
				if(left==10) {
					left=0;
					right++;
				}
			}else {
				i++;
				right++;
			}
			if(right%10==0)
				d++;
		}
		if(left==0 && right==0) {
			System.out.println(k);
		}else if(left==0) {
			System.out.println(right+""+k);
		}else {
			System.out.println(right+""+k+""+left);
		}
	}
}
