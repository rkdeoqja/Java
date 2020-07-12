package chapter4_Operation;

public class OperationEx08 {

	public static void main(String[] args) {
		//다음은 for문을 이용한 3의 배수를 출력하지 않는 프로그램이다
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		//반대로 3의 배수만 출력할수도 있다.
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.println(i);
			}else {
				continue;
			}
		}
		//다음은 for문을 이용해 3의 배수 이면서 7의 배수를 출력하는 프로그램이다.
		int count=0;
		for(int i=1;i<=100;i++) { //1부터 100까지 1씩 증가하면서
			if(i%3==0&&i%7==0) {// 3으로 나누어지고 7로 나누어 지는값이 들어왔을때 if 문 안으로 들어온뒤 
				System.out.println("3의 배수이면서 7의 배수 i: "+i);//i의 값을 출력하고
				count++;	//3과 7의 배수를 카운트한다
			}else {
				continue;//그외에는 컨티뉴를 이용하여 다시 반복한다
			}
		}
		System.out.println("1부터 100까지 3의배수이면서 7의 배수는 "+count+"개 입니다.");
		//출력 결과 21,42,63,84 count: 4
	}

}
