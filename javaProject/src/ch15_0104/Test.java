package ch15_0104;

public class Test {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("ABC");
			System.out.println(num);
			
		} catch (NumberFormatException e) {
			System.out.println("NumberFormat 예외발생");
		}
	}

}
