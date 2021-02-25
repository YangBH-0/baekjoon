package baekjoon_level_12;

import java.util.*;

public class Main_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<String> name = new LinkedList<String>();
		LinkedList<Integer> age = new LinkedList<Integer>();
		age.add(sc.nextInt());
		name.add(sc.nextLine());
		int index;
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			index = 0;
			while (age.size() > index && a >= age.get(index)) {
				index++;
			}
			;
			if(index==0) {
				age.add(index, a);
				name.add(index, sc.nextLine());
			}else if(index==age.size()) {
				age.add(a);
				name.add(sc.nextLine());
			}else {
				age.add(index,a);
				name.add(index,sc.nextLine());
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(age.get(i) + " " + name.get(i));
		}
	}
}
