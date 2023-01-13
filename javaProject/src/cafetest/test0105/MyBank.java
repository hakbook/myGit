package cafetest.test0105;

public class MyBank {
	
	public synchronized void Bank1() {
		int Balance = 10;
		for(int i=0; i<5; i++) {
			System.out.println("홍길동님의 통장잔고는 "+(Balance+(i*10))+"만원 입니다.");
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	public synchronized void Bank2() {
		int Balance = 20;
		for(int i=0; i<5; i++) {
			System.out.println("사임당님의 통장잔고는 "+(Balance+(i*10))+"만원 입니다.");
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	public synchronized void Bank3() {
		int Balance = 30;
		for(int i=0; i<5; i++) {
			System.out.println("이몽룡님의 통장잔고는 "+(Balance+(i*10))+"만원 입니다.");
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
