package SamplePackage;

public class MethodInStringWrapper {

	public static void main(String[] args) {
		// 문자의 마지막 인덱스 찾기
		String str_2 = new String("String Wrapper 클래스 기능이 너무 많아요..ㅠㅠ");
		// 문자열의 처음 인덱스에 있는 문자 찾기
		System.out.println("문자열의 첫 번째 인덱스 문자는 : " + str_2.charAt(0) + " 입니다.");
		// 문자열의 마지막 인덱스에 있는 문자 찾기
		// 문자열의 마지막 인덱스 찾는 공식 ( 문자열의 길이 - 1 )
		System.out.println("문자열의 마지막 인덱스 문자는 : " + str_2.charAt(str_2.length() -1) + " 입니다.");
		
		// 문자열의 두 번째 마지막 인덱스에 있는 문자 찾기
		// ( 문자열 길이 - 2 )
		System.out.println("문자열의 두 번째 마지막 인덱스의 문자는 : " + str_2.charAt(str_2.length() -2) + " 입니다.");
		
		// 문자열의 세 번째 마지막 인덱스에 있는 문자 찾기
		// ( 문자열 길이 - 3 )
		System.out.println("문자열의 세 번째 마지막 인덱스의 문자는 : " + str_2.charAt(str_2.length() -3) + " 입니다.");
	}
}




