package SamplePackage;

public class splitClass {

	public static void main(String[] args) {
		
		String toDay = "2024-01-19";
		String[] toDayArray;
		
		
		// 첫 번째 방법 : 배열의 인덱스에 하나씩 저장한다.
		toDayArray = toDay.split("-");
		System.out.printf("배열의 첫 번째 인덱스 데이터 : %s년\n", toDayArray[0]); // [0]의 임의의 주소 : @7d
		System.out.printf("배열의 두 번째 인덱스 데이터 : %s월\n", toDayArray[1]); // [1]의 임의의 주소 : 417
		System.out.printf("배열의 세 번째 인덱스 데이터 : %s일\n", toDayArray[2]); // [2]의 임의의 주소 : 077
		System.out.println();
		System.out.printf("배열의 첫 번째 데이터 저장 인덱스 주소 : %s\n", toDayArray[0].hashCode()); // 실제주소
		System.out.printf("배열의 두 번째 데이터 저장 인덱스 주소 : %s\n", toDayArray[1].hashCode()); // 실제주소
		System.out.printf("배열의 세 번째 데이터 저장 인덱스 주소 : %s\n", toDayArray[2].hashCode()); // 실제주소
		
		
		
		System.out.println();
		// 문자열을 더해 문자열 하나로 합치기
		System.out.println("[ 문자열 더하기 (+)연산자로 문자열 하나로 합치기 ]");
		System.out.println("(+)연산 문자열 합친 오늘 날짜 : [ "+toDayArray[0]+"년 "+toDayArray[1]+"월 "+toDayArray[2]+"일 입니다. ]\n");
		
		
		
		// concat( )메서드를 활용하여 문자열 합치기
		System.out.println();
		System.out.println("concat( )메서드를 이용해 문자열 하나로 합치기");
		System.out.println("concat( )문자열 합친 오늘 날짜 : [ " + toDayArray[0].concat(toDayArray[1]).concat(toDayArray[2])+" ]");

	}
}














