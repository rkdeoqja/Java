package chapter2_Operator;

public class OperatorEx10 {

	public static void main(String[] args) {
		
		char ch ='b';
		String msg;
		
		char ch1 = 'B';
		System.out.println("ch: "+(int)ch);
		System.out.println("ch1: "+(int)ch1);
		
		msg = ((int)ch <=(int)ch1)?"대문자입니다":"소문자입니다"; 
		// ch인 소문자'b'의 아스킷 코드가 98이므로 ch1의 66의 아스킷코드보다 크므로 false에 있는 값을 msg에 저장한다
		System.out.println("msg: "+msg);
		
		//65 < ch1 <90    //97 < ch <122
		
		msg = ('A'<= ch&&ch <='Z')?"대문자입니다":"소문자입니다"; 
		//AND연산자를 조건삼항연산자의 조건식에 대입한 경우 앞은 true이나 뒤의 조건이  false이므로 false에 있는 문자를 msg에 저장한다
		System.out.println("msg: "+msg);
		
		char a = '독';
		char 가 = (int)'가';
		char 힟 = (int)'힟';
		
		String msg1;
		msg1 = (가<=a)&&(a<=힟)?"한글입니다":"한글이 아닙니다"; 
		//변수 a를 아스킷코드 한글의 시작에있는 '가'와 끝에있는 '힟'에 비교해 한글인지 아닌지  비교하고있다.
		
		System.out.println("msg:"+msg1);
	}

}
