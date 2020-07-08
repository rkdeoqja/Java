package chapter3_Console;

import java.util.Date;

public class ConsoleEx02 {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.printf("오늘은 %tY년 %tm월 %td일 입니다.",now,now,now);	
		System.out.printf("\n현재시간은%tH시 %tM분 %tS초 입니다",now,now,now);
		// %서식문자
		// %tY4자리 년, %ty 2자리년, %tm 2자리 월, %td 2자리 일 , %tH 2자리 시,%tM 2자리 분,%tS 2자리 초
 		System.out.printf("\n오늘은%1$tY년 %1$tm월 %1$td일 입니다",now,now,now);
		System.out.printf("\n현재시간은 %1$tH시 %1$tM분 %1$tS초 입니다.", now);
	}

}
