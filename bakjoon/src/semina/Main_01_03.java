package semina;

public class Main_01_03 {
	public static char[] color = { 'Y', 'R', 'G', 'B' };
	public static String[] dice = { "YBRBRG", "GYBGBY", "RGBYYR", "YBGBYY" };
	public static int cnt;

	public static void backtracking(int floor, int arr[]) {
		// 4층까지 쌓았으면 다음 단계
		if (floor == 4) {
			isTest(arr);
			return;
		}
		// 각 층마다 밑면이 되는 경우를 골라 쌓기
		for (int i = 0; i < 3; i++) {
			arr[floor] = i;
			backtracking(floor + 1, arr);
		}

		return;

	}

	public static void isTest(int arr[]) {
		String[] str = new String[4];
		// 쌓은 기둥의 밑면 정하고 남은 면 추출
		for (int i = 0; i < 4; i++) {
			str[i] = isChoose(arr[i], dice[i]);
		}
		// 정면이랑 측면에 무슨 면이 올지 정하기
		func(0, str, new String[4]);
		return;
	}

	public static void func(int row, String[] str, String[] column) {
		// 4층까지의 정육면체를 각 층의 정육면체가 회전해서 나온 결과 
		if (row == 4) {
			if (isVaild(column)) {
				cnt++;
			}
			return;
		}
		// 층마다 정면과 측면 정해주는 부분
		for (int i = 0; i < 2; i++) {
			column[row] = "";
			column[row] += "" + str[row].charAt(i * 2) + str[row].charAt((i * 2 + 2) % 4);
			column[row] += "" + str[row].charAt(i * 2 + 1) + str[row].charAt((i * 2 + 3) % 4);
			func(row + 1, str, column);
		}
		return;
	}

	public static boolean isVaild(String[] column) {
		boolean color_check;
		// 각 기둥의 면이 4가지 색이 나타내는지 검사 
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				color_check = false;
				for (int k = 0; k < 4; k++) {
					if (column[i].charAt(k) == color[j]) {
						if (color_check) {
							System.out.println(i+1+"번째 면이  "+column[i]+"라 탈락합니다.");
							return false;
						} else {
							color_check = true;
						}
					}
				}
			}
		}
		return true;
	}
	// 밑면과 윗면을 정했으면 측면쪽 색을 짝을 지어서 추출하는 곳
	public static String isChoose(int n, String s) {
		// n은 주사위의 밑면 윗면 정하는 변수
		// n=0 0:2
		// n=1 1:3
		// n=2 4:5
		switch (n) {
		case (0): {
			return "" + s.charAt(1) + s.charAt(3) + s.charAt(4) + s.charAt(5);
		}
		case (1): {
			return "" + s.charAt(0) + s.charAt(2) + s.charAt(4) + s.charAt(5);
		}
		case (2): {
			return "" + s.charAt(0) + s.charAt(2) + s.charAt(1) + s.charAt(3);
		}
		default: {
			return "";
		}
		}
	}

	public static void main(String[] args) {
		cnt = 0;
		backtracking(0, new int[4]);
		System.out.println(cnt);
	}
}
