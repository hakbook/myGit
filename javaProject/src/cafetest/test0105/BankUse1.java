package cafetest.test0105;

public class BankUse1 extends MyBank1 {
	public static void main(String[] args) {
		
		MyBank1 my = new MyBank1();
		my.setName("홍길동");
		
		MyBank1 my1 = new MyBank1();
		my1.setName("사임당");
		
		MyBank1 my2 = new MyBank1();
		my2.setName("이몽룡");
		
		BankPlayer1 hong = new BankPlayer1(1, my, "홍길동");
		BankPlayer1 sa = new BankPlayer1(2, my1, "사임당");
		BankPlayer1 lee = new BankPlayer1(3, my2, "이몽룡");
		
		hong.run();
		sa.run();
		lee.run();
	}
}
