package chapter4_Operation;

public class OperationEx07 {

	public static void main(String[] args) {
		//for 반복문
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		//for 반복문은 괄호에 초기식 조건식 증감식이라는 부문으로 나누어지고 해당조건이 맞을동안 반복하면서 수행문을 수행한다
		
		int x=2;
		
		for(int i =0; i<=10;i+=x) {
			
			System.out.println(i);
		}
		//for문의 증감식 부분에 x값만큼 증가하게 하여 사용할수도 있다.
		//해당 식을 풀어보자면 (int i=0 정수형변수 i의 값은 0으로 초기화,i<=10 i는 10보다 작거나 같을동안,i+=x i에 x를 더한값을 저장한만큼 증가한다
		
		//다음은 for반복문을 이용하여 1부터 100까지 누적합을 구하는 프로그램을 만들어 보았다
		int sum=0;
		for(int i=0;i<=100;i++) {
			sum += i;
			System.out.println(sum);
		}
		//for문의 i변수는 지역변수라서 for문을 벗어난 다른곳에서 사용하거나 불러올수없다
		//반면 sum은 for문 밖에서 선언된것이라 for문 밖에서도 사용할수 있는것을 확인할수 있다.
		
		
		
	}

}
