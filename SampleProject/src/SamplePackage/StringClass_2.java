package SamplePackage;

public class StringClass_2 {

	public static void main(String[] args) {
	
		String str = "오늘은 날씨가 추워요! 그래서 오늘은 다들 따듯하게 옷을 입었어요~";
		
		System.out.println("문자열 데이터에서 첫 번째로 찾은 문자열의 시작위치는? : " + str.indexOf("오늘은", 0));
		System.out.println("문자열 데이터에서 두 번째로 찾을 문자열의 시작위치는? : " + str.indexOf("오늘은", 1));
	}
}





