import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시오 :");
		int num=0,sum=0;
		num=sc.nextInt();
		int i=0;
		
		if(num%2==0) {
			
			for(i=1;i<=num;i++) {
				if(i%2==0) {
					sum+=i;
				}
			}
		}
		else
		{
			for(i=1;i<=num;i++) {
				if(i%2!=0)
					sum+=i;
			}
		}
	
		System.out.println("결과값 "+sum);
	}

}
