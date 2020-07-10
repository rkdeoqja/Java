package chapter4_Operation;

public class OperationEx06 {

	public static void main(String[] args) {
		//do ~ while 반복문
		
		int num=10;
		
		do { // do while문은 해당조건이 맞지않더라도 한번은 실행된다
			System.out.println("num은 7보다 작지 않지만 실행되는것을 볼수있습니다.num: "+num);
			num++;
		}while(num < 7);
		
		System.out.println("do while문이 종료된 뒤 num의 값: "+num);
		
		//do while 문을 이용한 1부터 100까지의 합구하기
		int n =0;
		int sum=0;
		do {
			n++;
			sum+=n;
			System.out.print("sum: "+sum+", ");
		}while(n<100);
			System.out.println("n: "+n);
		
		
		
	}

}
