
public class Ex05 {

	public static void main(String[] args) {
		//95이상이면 A+, 90이상이면 A, 85이상이면 B+, 80이상이면 B
		int score = 87;
		if (score >= 95) {// if(score<=100 && score>=95) : 암시적 조건
			System.out.println("A+");
		}else if (score >= 90) {//if(score<95 && score>=90)
			System.out.println("A");
		}else if (score >= 85) {
			System.out.println("B+");
		}else if (score >= 80) {
			System.out.println("B");
		}else {
			System.out.println("F");
		}
		System.out.println("=========switch========");
		switch(score) {
		case 100:case 99:case 98:case 97:case 96:
		case 95:System.out.println("A+"); break;
		case 94:case 93:case 92:case 91:
		case 90:System.out.println("A"); break;
		case 89:case 88:case 87:case 86:
		case 85:System.out.println("B+"); break;
		case 84:case 83:case 82:case 81:
		case 80:System.out.println("B"); break;
		default:System.out.println("F"); break;//맨 마지막문에는 break문을 굳이 적지 않다도 됨
		}
		switch(score) {
		case 100:case 99:case 98:case 97:case 96:
		case 95:System.out.println("A+"); break;
		case 94:case 93:case 92:case 91:
		case 90:System.out.println("A"); break;
		case 89:case 88:case 87:case 86:
		case 85:System.out.println("B+"); break;
		
		default:System.out.println("F"); break;//중간에 default문 넣을때는 break필요
		
		case 84:case 83:case 82:case 81:
		case 80:System.out.println("B");//맨 마지막 문이기 때문에 안적어도 됨.
		}

	}

}
