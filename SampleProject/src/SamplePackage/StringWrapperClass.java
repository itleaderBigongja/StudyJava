package SamplePackage;
public class StringWrapperClass {
	public static void main(String[] args) {
		
		// String Wrapper 클래스의 데이터 저장 방식_1
		// 첫 번째 데이터 저장방식 ( 변수를 객채화하여 선언과 동시에 데이터 저장 )
		String str_1 = new String("차세대 IT리더가 되고픈 비공자 입니다.");
		System.out.println("첫 번째 방식 : " + str_1);
		
		// String Wrapper 클래스의 데이터 저장 방식_2
		// 두 번째 데이터 저장방식 ( 객체화로 선언만 하고, 리터럴표기 방식으로 데이터 저장 )
		String str_2 = new String();
		str_2 = "오늘은 블로그를 새로 이사 했어요~!";
		System.out.println("두 번째 방식 : " + str_2);
		
		// String 변수에 데이터를 리터럴 표기방식으로 저장
		String str_3 = "저는 IT를 좋아해요~!";
		System.out.println("세 번째 방식 : " + str_3);
	}
}
