package chapter2_Operator;

public class OperatorEx09 {

	public static void main(String[] args) {
		//조건 삼항 연산자 (조건식)?true값:false값
		
		int x = 10;
		int absX;
		
		absX = (x>=0)? x: -x;  //x는 0과 같진않지만 크기때문에 true 절대값으론 x의 값이 들어간다 
		
		System.out.println("x= 10 일때 x의 절대값: "+absX);
		
		int y = -20;			
		int absY;
		
		absY = (y >= 0)? y: -y; //y는 0보다 크거나 같지 않기 때문에 false -20에 -가 적용되 음수가 양수가 된 값이 들어간다 
		System.out.println("y= -20일때 y의 절대값: "+absY);
		
		int a= 5;
		int b= 10;
		
		int max;
		int min;
		
		max =(a>b)?a:b;   //a는 b보다 크지 않으니 false b의값이  max값으로 들어가게된다
		min =(a<b)?a:b;	  //a는 b보다 작으니 true a값이 min값으로 들어가게 된다.
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		
		String msg = "조건 삼항 연산자를 사용하고 있습니다.";
		System.out.println(msg);
		
		msg=true?"참":"거짓";				//기본자료형 정수형 변수 뿐아니라 참조자료형인 String에도 적용되는것을 볼수있다
		System.out.println(msg);
	}

}
