package uiseon.basic.day03;

public class EX02 {
	public static void main(String[] args) {
		System.out.println(3 + 4.5 * 2 + 27 / 8);

		System.out.println(true || false && 3 < 4 || (5 == 7));

		System.out.println(true || (3 < 5 && 6 >= 2));

		// System.out.println(!true > 'A');
		// 잘못된 비교대상으로 오류

		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');
		// 단일문자를 수식으로 사용하면
		// 자동으로 숫자형으로 바뀜
		// 숫자형으로 변환시 ASCII코드값을 참조함
		// 0 : 48, A : 65 , a: 97
		// =>Z : 90 ,D :68 , M : 77
		System.out.println('D' + 1 + 'M' % 2 / 3);

		System.out.println(5.0 / 3 + 3 / 3);

		System.out.println(53 % 21 < 45 / 18);

		System.out.println(4 < 6 || true && false || false && (2 > 3));

		System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));

		// 특정연도-1의 12월 31일의 요일 출력
		// 0:일, 1:월 , ...,6:토
		// 따라서,특정연도의 1월 1일의 요일의 요일을 출력하려면
		// 계산식 결과에 +1을 해주면 됨
		// H와 I사이 산술연산자로인해
		// H와 I가 숫자형으로 변환되어 +연산이 수행됨
		// 출력할 대상이 지정되지 않았으므로 오류발생!
		// System.out.println
		// 괄호가 필요!
		// 문자열에 사용할 수 없는 증감연산자를 사용했음

		// 증감 연산자
		// 피연산자의 값을 하나 증가시키거나 감소시킴
		// 피연산자의 어느 쪽에 위치하는가에 따라 연산의 순서가 달라짐
		// i = 1 => i = i + 1 => i + = 1 => ++i
		// => i = i + 3 => i + = 3
		int a = 7, b = 7;

		int result3 = ++a + 10;
		// a값을 증가시킨후 연산에 적용(전치)
		int result4 = b++ + 10;
		// a값을 연산에 적용한 후 값 증가 (후치)

	}

}
