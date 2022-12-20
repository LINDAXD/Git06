package Git06;

import java.util.Scanner;

public class Git01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수값을 입력하세요. :");
		int num1 = scanner.nextInt();
		System.out.print("원하는 배수값을 입력하세요. :");
		int num2 = scanner.nextInt();

		if(num1 > num2) {
			for(int i = 1; i <= num1; ++i) {
				if(i% num2 != 0)
					continue;
				System.out.print(i + " ");
			}
		}else {
			System.out.println("잘못된 입력값입니다.");
		}
		scanner.close();
	}

}