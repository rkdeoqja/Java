package chapter2_Operator;

public class OperatorEx06 {

	public static void main(String[] args) {
		//�� ������ 
		// and ������ &&�� or ������ ||�� not �������� !�� �ִ�.
		//&&�������� ��� �Ѵ� true�� ��쿡�� true�� ��ȯ�ϸ� ���� �ϳ��� false��� false�� �ȴ�.
		//||�����ڴ� ���� �ϳ��� true�� ��쿡 true�� ��ȯ�Ѵ� �������� false�� �ϳ��� true�� �ִٸ� true�� ��ȯ�Ѵ�
		//!�����ڴ� �ݴ�Ǵ� ���� ��ȯ�Ѵ� true�ϰ�� false�� , false�ϰ�� true�� ��ȯ�Ѵ�
		boolean t,f,t2,result;
		t= true;
		f= false;
		t2= true;
		
		result = t && f;
		System.out.println("t && f : "+result);
		
		result = t || f;
		System.out.println("t || f : "+ result);
		
		result = !t;
		System.out.println("!t : "+result);
		
		result = t && t2;
		System.out.println("t && t2 : "+result);
		
		int a,b;
		a = b = 10;
					//false  		//false
		result = (a++ >= ++b) && (++a <= b++);
		//		  10  >=  11  &&  12  <=  11 
		// a�� 10���� ���������ϱ⶧���� ���簪�� 10�̰� b�� ���������� 11�� �Ǿ��ִ»�Ȳ ���� 10�� 11���� ũ�ų� ���� �ʱ� ������ false
		// �������� ������ �ִ� a�� 11�� �Ǿ� �Ѿ������ ���������� 12�� �Ǿ��� b�� 11�� �Ǿ� �Ѿ�µ� ���������̱⶧���� ���簪�� 11�̴�
		// �׷��Ƿ� 12�� 11���� �۰ų� ���� �����Ƿ� false�� ��ȯ�ϸ� 
		// AND ���������̱� ������ ���� �ϳ��� false�� false�� ��ȯ�Ѵ� ���� false�� ������̴�.
		
		System.out.println("(a++ >= ++b) && (++a <= ++b) result: "+result);
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		
		// �������ڿ� SCE (Short Circuit Evolution) 
		// java javascript python�� sce�� �����ϴµ� sce�� �ִܰŸ� �������̸� 
		// AND�����ڿ��� ù��° ������ false�ΰ�쿡 �Ŀ� �������� false�̴�  �ڿ� ������� ���� ����� �����ʰ� false�� ��ȯ�Ѵ�.
		// OR�����ڴ� ù��° ������ true�ϰ�� �ڿ� �������� true�� ��ȯ�ϴ� �ڿ����� ����� �����ʰ� true�� ��ȯ�Ѵ�.
	
	
	}

}
