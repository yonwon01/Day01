import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시오 :");
		int num=0;
		num=sc.nextInt();
		
		if(num%3==0)
		System.out.println("3의 배수입니다.");
	}

}
