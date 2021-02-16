package baekjoon_level_08;

import java.util.Scanner;

public class Main_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(), result = "";
		String[] arr = s.split(" ");
		char[] a = arr[0].toCharArray(), b = arr[1].toCharArray(), temp;
		boolean f = false;
		if (b.length > a.length) {
			temp = a;
			a = b;
			b = temp;
		}
		int t1, t2, a_index = a.length - 1;
		for (int i = b.length - 1; i >= 0; i--) {
			if (f) {
				t1 = (int) a[a_index--] - 48;
				t2 = (int) b[i] - 48;
				t1++;
				f = false;
				if (((t1 + t2) / 10) == 1)
					f = true;
				result = ((t1 + t2) % 10) + result;
			} else {
				t1 = (int) a[a_index--] - 48;
				t2 = (int) b[i] - 48;
				if (((t1 + t2) / 10) == 1)
					f = true;
				result = ((t1 + t2) % 10) + result;
			}
		}
		if (b.length < a.length) {
			while (a_index >= 0) {
				t1 = (int) a[a_index--] - 48;
				if (f) {
					f = false;
					t1++;
					if (t1 == 10)
						f = true;
					result = (t1 % 10) + result;
				} else {
					result = (t1 % 10) + result;
				}
			}
		}
		if (f)
			result = 1 + result;
		System.out.print(result);
	}
}
