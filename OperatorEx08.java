package chapter2_operator;

public class OperatorEx08 {

	public static void main(String[] args) {
		//고급 개발자 스킬 시프트 연산
		//시프트 연산은 <<,>>기호를 통해 왼쪽이나 오른쪽을 정한뒤 뒤에오는 숫자만큼을 이동한다 
		
		
		byte n1 = 2 ;			  //128 64 32 16 8 4 2 1
		byte r1 = (byte)(n1 << 1); // 0  0  0  0 0 0 1 0 << 왼쪽으로 1칸이동  출력값: 4
		byte r2 = (byte)(n1 << 2); // 0  0  0  0 0 0 1 0 << 왼쪽으로 2칸이동  출력값: 8
		byte r3 = (byte)(n1 << 3); // 0  0  0  0 0 0 1 0 << 왼쪽으로 3칸이동  출력값: 16
		byte r4 = (byte)(n1 << 4); // 0  0  0  0 0 0 1 0 << 왼쪽으로 4칸이동  출력값: 32
		
		System.out.println("n1 << 1 : "+ r1); 
		System.out.println("n1 << 2: "+ r2);
		System.out.println("n1 << 3: "+ r3);
		System.out.println("n1 << 4: "+ r4);
		
		byte n2 = 10;			  //128 64 32 16 8 4 2 1
		byte r5 = (byte)(n2 >> 1); // 0  0  0  0 1 0 1 0 >> 오른쪽으로 1칸이동  출력값: 5
		byte r6 = (byte)(n2 >> 2); // 0  0  0  0 1 0 1 0 >> 오른쪽으로 2칸이동  출력값: 2
		byte r7 = (byte)(n2 >> 3); // 0  0  0  0 1 0 1 0 >> 오른쪽으로 3칸이동  출력값: 1
		byte r8 = (byte)(n2 >> 4); // 0  0  0  0 1 0 1 0 >> 오른쪽으로 4칸이동  출력값: 0
		
		System.out.println("n2 >> 1 : "+ r5); 
		System.out.println("n2 >> 2: "+ r6);
		System.out.println("n2 >> 3: "+ r7);
		System.out.println("n2 >> 4: "+ r8);
		
	}

}
