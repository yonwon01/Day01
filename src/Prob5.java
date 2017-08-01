import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i = 0, j = 0;
		int cnt=0;
		for (j = 1; j <= 99; j++) {
			String str = String.valueOf(j);
		
			for (i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') {
				cnt++;	
				
				}
			}
			if(cnt>0) {
				System.out.print(str +" ");
				for(i=1;i<=cnt;i++) {
					System.out.print("짝");
				}
				System.out.println();
			}
			
			cnt=0;
		}

	}

}
