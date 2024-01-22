package SamplePackage;

public class IsEmptyAndIsBlankClass {

	public static void main(String[] args) {
		
		String strDataYn = "";
		System.out.println("문자열 변수에 데이터가 존재하지 않을 경우");
		System.out.printf("isBlank( )의 결과 : %s", strDataYn.isBlank() + "\n");
		System.out.printf("isEmpty( )의 결과 : %s", strDataYn.isEmpty() + "\n");
		
		System.out.println();
		
		strDataYn = "이번엔 데이터가 들어 왔다!!!";
		System.out.println("문자열 변수에 데이터가 존재한 경우");	
		System.out.printf("isBlank( )의 결과 : %s", strDataYn.isBlank() + "\n");
		System.out.printf("isEmpty( )의 결과 : %s", strDataYn.isEmpty() + "\n");
		
		System.out.println();
		
		strDataYn = " ";
		System.out.println("문자열 변수에 공백을 저장한 경우");
		System.out.printf("isBlank( )의 결과 : %s", strDataYn.isBlank() + "\n");
		System.out.printf("isEmpty( )의 결과 : %s", strDataYn.isEmpty() + "\n");
		
		
	}
}




