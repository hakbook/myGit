package cafetest.test0102;

public class WrapperEx3 {
	public static void main(String[] args) {
		String a = "Hello 1234";
		char[] b = a.toCharArray();
		
		System.out.println("(Chracter 사용)");
		for(int i=0; i<b.length; i++) {
			if(Character.isUpperCase(b[i])) {
				System.out.println(b[i] + "는 대문자입니다.");
			
			}else if(Character.isLowerCase(b[i])){
			System.out.println(b[i] + "는 소문자입니다.");
			
			}else if(Character.isDigit(b[i])) {
				System.out.println(b[i] + "는 숫자입니다.");
			}
		}
		System.out.println("----------------------");
		
		System.out.println("(Integer 사용)");
		System.out.println("문자 " + a.substring(6) + "입니다.");
		System.out.println("숫자 " + Integer.parseInt(a.substring(6)) + "입니다.");
		System.out.println("숫자 " + Integer.parseInt(a.substring(6)) + " + 2 = " + (Integer.parseInt(a.substring(6))+2) + "입니다.");
	}
}
