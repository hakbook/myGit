package cafetest.test0105;

public class BankPlayer extends Thread {
	int type;
	MyBank my;
	
	public BankPlayer(int type, MyBank my) {
		this.type = type;
		this.my = my;
	}
	@Override
	public void run() {
		switch (type) {
		case 1: my.Bank1(); break;
		case 2: my.Bank2(); break;
		case 3: my.Bank3(); break;
		}
	}
}

