package chapter3_Console;

import java.util.Date;

public class ConsoleEx02 {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.printf("������ %tY�� %tm�� %td�� �Դϴ�.",now,now,now);	
		System.out.printf("\n����ð���%tH�� %tM�� %tS�� �Դϴ�",now,now,now);
		// %���Ĺ���
		// %tY4�ڸ� ��, %ty 2�ڸ���, %tm 2�ڸ� ��, %td 2�ڸ� �� , %tH 2�ڸ� ��,%tM 2�ڸ� ��,%tS 2�ڸ� ��
 		System.out.printf("\n������%1$tY�� %1$tm�� %1$td�� �Դϴ�",now,now,now);
		System.out.printf("\n����ð��� %1$tH�� %1$tM�� %1$tS�� �Դϴ�.", now);
	}

}
