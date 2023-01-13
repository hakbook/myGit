package cafetest.test0105;

public class MyBank1 {
	String name;
	
	public synchronized void Bank1() {
		int Balance = 10;
		for(int i=0; i<5; i++) {
			System.out.println(getName()+"님의 통장잔고는 "+(Balance+(i*10))+"만원 입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	public synchronized void Bank2() {
		int Balance = 20;
		for(int i=0; i<5; i++) {
			System.out.println(getName()+"님의 통장잔고는 "+(Balance+(i*10))+"만원 입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	public synchronized void Bank3() {
		int Balance = 30;
		for(int i=0; i<5; i++) {
			System.out.println(getName()+"님의 통장잔고는 "+(Balance+(i*10))+"만원 입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
