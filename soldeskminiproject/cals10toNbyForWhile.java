package mywork;
//바로 편집도 가능한데 한글입력이 아주 느리네요.
import java.util.Scanner;

public class cals10toNbyForWhile {

	public static void main(String[] args) {
		System.out.println("10toN 진수변환기, -1입력시 종료");
		Scanner input = new Scanner(System.in);
		int a=1;
		while (a!=-1) {
			System.out.print("\n변환할 숫자를 입력해주세요 : ");
			a = input.nextInt();
			if (a!=-1) { 
				System.out.print("몇진수로 변환하시겠습니까? : ");
				int n = input.nextInt();
				int a2 = a;//파워측정용 카피본
				int p = 0; //파워
				for (; a2>1; p++) {a2/=n;}//파워측정기
		
				String two = "";
		
				for (int b = (int)Math.pow(n, p); b>=1; b/=n) { 
					int f = a/b; 
					a -= b*f; 
					two += f;
				} 
				System.out.println("="+two);
			}
			else {
				break;
			}
		}
		System.out.println("끗!!!");
	}

}
