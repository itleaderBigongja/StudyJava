package SamplePackage;

public class CompareToClass {

	public static void main(String[] args) {
		
		String str_1 = "abcdefg";
		String str_2 = "bcdefgh";
		String str_3 = "cdefghi";
		
		System.out.println("문자열의 시작이 다른 문자열의 범위 비교");
		System.out.println("str_1의 문자열의 시작 문자 : " + str_1.charAt(0));
		System.out.println("str_2의 문자열의 시작 문자 : " + str_2.charAt(0));
		System.out.println("str_3의 문자열의 시작 문자 : " + str_3.charAt(0));
		
		System.out.printf("str_1의 문자열의 시작 문자 " + str_1.charAt(0) + "의 아스키 코드 값 : %d\n", Integer.valueOf(str_1.charAt(0)));
		System.out.printf("str_2의 문자열의 시작 문자 " + str_2.charAt(0) + "의 아스키 코드 값 : %d\n", Integer.valueOf(str_2.charAt(0)));
		System.out.printf("str_3의 문자열의 시작 문자 " + str_3.charAt(0) + "의 아스키 코드 값 : %d\n", Integer.valueOf(str_3.charAt(0)));
		
		System.out.printf("a와 b의 범위 차이 : %d\n", str_1.compareTo(str_2)); // 97 - 98 = -1
		System.out.printf("b와 c의 범위 차이 : %d\n", str_2.compareTo(str_3)); // 98 - 97 = -1
		System.out.printf("c와 a의 범위 차이 : %d\n", str_3.compareTo(str_1)); // 99 - 97 = 2
	}
}


