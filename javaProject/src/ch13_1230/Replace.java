package ch13_1230;

public class Replace {
	public static void main(String[] args) {
		String a = "jana program";
		System.out.println(a.replace("a", "A"));
		
		a = a.replace("a", "A");
		System.out.println(a);
	}

}
