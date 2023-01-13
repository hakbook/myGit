package cafetest;

public class NameUnicode {
	public static void main(String[] args) {
		char name = '\uc774';
		char name2 = '\ud559';
		char name3 = '\ub3d9';
		
		System.out.println("char형(\'\\uc774\') : " + name);
		System.out.println("char형(\'\\ud559\') : " + name2);
		System.out.println("char형(\'\\ub3d9\') : " + name3);
	}
}
