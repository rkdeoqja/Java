package chapter2_Operator;

public class OperatorEx09 {

	public static void main(String[] args) {
		//���� ���� ������ (���ǽ�)?true��:false��
		
		int x = 10;
		int absX;
		
		absX = (x>=0)? x: -x;  //x�� 0�� ���������� ũ�⶧���� true ���밪���� x�� ���� ���� 
		
		System.out.println("x= 10 �϶� x�� ���밪: "+absX);
		
		int y = -20;			
		int absY;
		
		absY = (y >= 0)? y: -y; //y�� 0���� ũ�ų� ���� �ʱ� ������ false -20�� -�� ����� ������ ����� �� ���� ���� 
		System.out.println("y= -20�϶� y�� ���밪: "+absY);
		
		int a= 5;
		int b= 10;
		
		int max;
		int min;
		
		max =(a>b)?a:b;   //a�� b���� ũ�� ������ false b�ǰ���  max������ ���Եȴ�
		min =(a<b)?a:b;	  //a�� b���� ������ true a���� min������ ���� �ȴ�.
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		
		String msg = "���� ���� �����ڸ� ����ϰ� �ֽ��ϴ�.";
		System.out.println(msg);
		
		msg=true?"��":"����";				//�⺻�ڷ��� ������ ���� �Ӿƴ϶� �����ڷ����� String���� ����Ǵ°��� �����ִ�
		System.out.println(msg);
	}

}
