package chapter2_Operator;

public class OperatorEx10 {

	public static void main(String[] args) {
		
		char ch ='b';
		String msg;
		
		char ch1 = 'B';
		System.out.println("ch: "+(int)ch);
		System.out.println("ch1: "+(int)ch1);
		
		msg = ((int)ch <=(int)ch1)?"�빮���Դϴ�":"�ҹ����Դϴ�"; 
		// ch�� �ҹ���'b'�� �ƽ�Ŷ �ڵ尡 98�̹Ƿ� ch1�� 66�� �ƽ�Ŷ�ڵ庸�� ũ�Ƿ� false�� �ִ� ���� msg�� �����Ѵ�
		System.out.println("msg: "+msg);
		
		//65 < ch1 <90    //97 < ch <122
		
		msg = ('A'<= ch&&ch <='Z')?"�빮���Դϴ�":"�ҹ����Դϴ�"; 
		//AND�����ڸ� ���ǻ��׿������� ���ǽĿ� ������ ��� ���� true�̳� ���� ������  false�̹Ƿ� false�� �ִ� ���ڸ� msg�� �����Ѵ�
		System.out.println("msg: "+msg);
		
		char a = '��';
		char �� = (int)'��';
		char �N = (int)'�N';
		
		String msg1;
		msg1 = (��<=a)&&(a<=�N)?"�ѱ��Դϴ�":"�ѱ��� �ƴմϴ�"; 
		//���� a�� �ƽ�Ŷ�ڵ� �ѱ��� ���ۿ��ִ� '��'�� �����ִ� '�N'�� ���� �ѱ����� �ƴ���  ���ϰ��ִ�.
		
		System.out.println("msg:"+msg1);
	}

}
