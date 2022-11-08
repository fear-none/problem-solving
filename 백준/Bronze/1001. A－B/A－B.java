import java.util.Scanner;

/*
두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
*/
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = a - b;
		System.out.println(result);
		scanner.close();
	}
}