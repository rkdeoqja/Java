package chapter3_Console;

import java.util.Scanner;

public class ConsoleEx04 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요");
		String line = scanner.nextLine();
		System.out.println("입력받은 문자는 \""+line+"\" 입니다");
		
		System.out.println("정수를 입력하세요");
		int num = scanner.nextInt();
		System.out.println("입력받은 정수는 "+num+" 입니다");
		
		System.out.println("실수를 입력하세요");
		double d = scanner.nextDouble();
		System.out.println("입력받은 실수는  "+d+" 입니다");
		
		//위와 같이 문자는 nextLine() 정수는 nextInt() 실수는 nextDouble() 메소드를 이용하면 입력받을수있다.
	}

}
