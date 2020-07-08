package chapter3_Console;

public class ConsoleEx01 {

	public static void main(String[] args) {
		
		System.out.print("정수는 7,실수는 3.14f,"); //print는 출력문이 출력되고 난뒤 자동줄바꿈이 안되고 한줄로만 출력된다.
		System.out.println("문자는J, 문자열은 Love"); //println은 출력문이 출력되고 난뒤  자동줄바꿈이 된다
		
		System.out.printf("정수는 %d, 실수는%f, 문자열%c, 문자열은%s,",7,3.1f,'J',"Love");
		//printf는 자동줄바꿈이 일어나지 않으며 형식이 잇는 출력
		//정수는 decimal의  %d 실수는 float의 %f 문자는 char의 %c 문자열은 String의 %s
		System.out.println();
		String str = "JAVA";
		
		System.out.printf("정수는 %d, 실수는%f, 문자는%c,문자열은%s",7,3.1f,'J',str);
	}	//printf("형식화된 문자열","형식화된 문자열에 제공할 값");

}
