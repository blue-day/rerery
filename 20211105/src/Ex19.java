
public class Ex19 {

	public static void main(String[] args) {
		// for문 3단부터 7단까지 4곱부터 6곱까지
		//		1		2		4
		for(int d = 3; d <= 7; d++) {//for(; : 위의 것을 그대로 가져온다는 것 같음)
			// 3시작
			//		3-1		3-2		3-4
			for(int g = 4; g <= 6; g++) {
				//3-3
				System.out.println(d+ " * "+ g + " = "+ d*g);
			}//끝
		}System.out.println("===============");
		int d = 3;
		while(d <= 7) {
			//3
			int g=4;//3-1
			while (g<=6) {//3-2
				//3-3
				System.out.println(d+ " * "+ g + " = "+ d*g);
				g++;//3-4
			}
			d++;//4
		}
		

	}

}
