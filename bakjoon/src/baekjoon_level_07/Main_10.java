package baekjoon_level_07;

public class Main_10 {
	public static boolean checkgroupword(String str) {
		int index=0; 
		while(index<str.length()-1) {
			if(str.charAt(index)==str.charAt(index+1)) {
				index++;
				continue;
			}
			for(int i=index+1;i<str.length();i++) {
				if(str.charAt(index)==str.charAt(i)) {
					return false;
				}
			}
			index++;
		}
		return true;
	}
	public static void main(String[]args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		int count=0;
		for(int i=0;i<n;i++) {
			if(checkgroupword(sc.nextLine())) {
				count++;
			}
		}
		System.out.println(count);
	}
}
