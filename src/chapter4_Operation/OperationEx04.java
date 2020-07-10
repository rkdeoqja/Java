package chapter4_Operation;

public class OperationEx04 {

	public static void main(String[] args) {
			
		//while 반복문
		int i = 10; //초기식
		
		while(i>=0) {//조건식
			System.out.print(i--+" "); //증감식
		}
		System.out.println("후행감소 후 i: "+i);
		
		int j = 10;
		
		while(j>=0) { //조건식에 들어가는 조건이 true일시 while문을 반복하게된다.
			System.out.print(--j+" ");
		}
		System.out.println("선행감소 후 j: "+j);
		
		//다음은 while문을 이용하여 1부터 100까지 의 합을 구해본 프로그램이다.
		
		int num = 1;
		int sum =0;
		
		while(num<=100) {
			sum +=num;
			num++;
		}
		
		System.out.println("num: "+num+", sum: "+sum);
		//출력 num:101, sum: 5050
		//num은 후행증가이므로 해당반복문이 종료된뒤에 값이 101로 증가하였고
		//1부터 100까지의 합은 5050이 된다.
		
		
	}

}
