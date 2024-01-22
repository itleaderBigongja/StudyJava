package SamplePackage;

public class equalsClass {

	public static void main(String[] args) {
		String str_1 = "I want to do Developer";
		String str_2 = "I want to do Developer";
		
		String str_3 = new String("I want to do Developer");
		String str_4 = new String("I have to Coding");
		
		String str_5 = "I have to Coding";
		String str_6 = new String("i have to coding");
		
		
		
		// 첫 번째 : equalsIgnoreCase()를 사용해 같은 문자열 비교 해보기
		System.out.println("[ 1. equalsIgnoreCase()를 사용해 같은 문자열 비교 해보기 ]");
		System.out.printf("equalsIgnoreCase() 메서드 str_1과 str_2 비교 결과 -> %s\n", str_1.equalsIgnoreCase(str_2));
		System.out.printf("equalsIgnoreCase() 메서드 str_1과 str_3 비교 결과 -> %s\n", str_1.equalsIgnoreCase(str_3));
		System.out.println();
	
		
		// 두 번째 : equalsIgnoreCase()를 사용해 다른 문자열 비교 해보기
		System.out.println("[ 2. equalsIgnoreCase()를 사용해 다른 문자열 비교 해보기 ]");
		System.out.printf("equalsIgnoreCase() 메서드 str_1과 str_5 비교 결과 -> %s\n", str_1.equalsIgnoreCase(str_5));
		System.out.printf("equalsIgnoreCase() 메서드 str_1과 str_4 비교 결과 -> %s\n", str_1.equalsIgnoreCase(str_4));
		System.out.println();
		
		// 세 번째 : equalsIgnoreCase()를 사용해 대소문자 비교 해보기
		System.out.println("[ 3. equalsIgnoreCase()를 사용해 문자열의 대소문자 비교 해보기 ]");
		System.out.printf("equalsIgnoreCase() 메서드 str_5와 str_6 비교 결과 -> %s\n", str_5.equalsIgnoreCase(str_6));
	}
}

