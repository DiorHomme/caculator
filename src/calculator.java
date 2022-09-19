import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 입력 값 : ");
		int first = scanner.nextInt();
		System.out.println(first);

		System.out.println("두번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		System.out.println("덧셈 : " + (first + second));
		System.out.println("뺄샘 : " + (first - second));
		System.out.println("곱샘 : " + (first * second));
		System.out.println("나눗셈 : " + (first / second));
	}
}
