package chapter1_variable;

public class VariableEx06 {

	public static void main(String[] args) {
		
		char ch1= 'A'; 		//0x41
		char ch2 = '한'; 	//0xD55C
		char ch3 = 54620; 	//0xD55C
		char ch4 = 0x3081; 	
		char ch5 = 0x3082;	
		char ch6 = '1';		
		char ch7 = 1;	
		
		//아래 출력 결과와 같이 기본자료형 char은 문자를 넣으면 바로 문자로 표기되지만 숫자나 16진수를 넣으면 
		//그에 해당하는 아스키코드표의 문자를 저장한다
		
		System.out.println(ch1);	//A
		System.out.println(ch2);	//한
		System.out.println(ch3);	//한
		System.out.println(ch4);	//め
		System.out.println(ch5);	//も
		System.out.println(ch6); 	//1
		System.out.println(ch7);	//
		
	}

}
