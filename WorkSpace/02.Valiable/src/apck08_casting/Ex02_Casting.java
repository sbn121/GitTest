package apck08_casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		// 문자열 = "12" + 34 = 답 1234
		// String + int = 답 String
		// Why? 문자열+ 어떤 값 = 문자열 규칙
		// 문자열 결합의 법칙 
		// "1"(String) =/= 1(숫자)
		String sum = "12" + 34;
		// 어떤 값을 String으로 바꾸는 것은 엄청나게 간단하다.
		String sum2 = 1234 + ""  ;
		System.out.println(sum2);
		
		//"1234" + "1234" = 12341234
		//sum + sum2 = 12341234
		//숫자 1234+1234=2468의 결과를 얻어야 한다.
		//String => int ?
		// int,  double 등의 보라색으로 글씨 바뀌는 것 => 기본타입
		// 대문자로 시작하는 것들은 대부분 Class타입
		// 기본 데이터 타입은 Wrapper class라는 것을 가지고 있다.
		//int => Integer, double Double
		// String을 해당하는 타입으로 바꿔주는 행위를 하는 것
		// String에 있는 ""<=를 제거한다.
		int num = Integer.parseInt(sum)+1234;
		int num2 = Integer.parseInt(sum2);
		System.out.println(num);
		System.out.println(num+num2);
		String sAvg = "88.6";
		double dAvg = Double.parseDouble(sAvg)+10;
		System.out.println(dAvg);
		String str3 = "456";
		int num3 = Integer.parseInt(str3);
		System.out.println(num3);
		//WrapperClass.parseDataType(String);=> DataType
		String str = "123";
	    int i1 = Integer.parseInt(str);
		System.out.println(i1);
		//콘솔창을 확인하기 (빨간색 줄 == 오류)
		
		
		//Float.parseFloat(sAvg);
		//Long.parseLong(sAvg);
		//Byte.parseByte(sAvg);
		
		
	}

}
