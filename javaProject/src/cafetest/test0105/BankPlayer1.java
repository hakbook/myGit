package cafetest.test0105;

public class BankPlayer1 extends Thread {
	int type;
	MyBank1 my;
	
	public BankPlayer1(int type, MyBank1 my, String name) {
		this.type = type;
		this.my = my;
		name = my.getName();
	}
	@Override
	public void run() {
		if(type == 1) {
			my.Bank1();
		}else if(type == 2) {
			my.Bank2(); 
		}else if(type == 3) {
			my.Bank3(); 
		}
	}
}

