
public class Ex18 {

	public static void main(String[] args) {
		// 3단부터  7단까지 출력하시오(while)
		int d = 3;
		while (d <= 7) {//??????//
			int g = 1;//여기에 적어야 d가 바뀔때 다시 1부터 돌아감
			while (g <= 9) {
				System.out.println(d + " * " + g + " = " + d*g);
				g++;
			}
			d++;
		}

	}

}
