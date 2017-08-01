import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("문자열을 입력하세요 :");//next는 space nextline은 개행
		str = sc.nextLine();

		int i = 0, j = 0;
		for (i = 0; i < str.length(); i++) {

			System.out.println(str.substring(0, i + 1));

		}

	}

}
