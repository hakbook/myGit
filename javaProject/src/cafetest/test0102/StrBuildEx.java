package cafetest.test0102;


public class StrBuildEx {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		String str2 = " Java Programmer"; 
		
		System.out.println("------------------------------------------");
		str1.append("I am a");
		System.out.println("append()메소드를 활용 : " + str1.append(str2));
		System.out.println("replace()메소드를 활용 : " + str1.replace(7, 11, "JSP"));
		System.out.println("substring()메소드를 활용 : " + str1.substring(7));
		System.out.println("------------------------------------------");
	}
}
