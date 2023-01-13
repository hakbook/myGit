package ch16_0104_0105;

public class DaemonThread implements Runnable {

	@Override
	public void run() {
		while (true) {//while(true)지만 main 스레드가 종료되면 자동종료됨
			System.out.println("데몬 스레드가 실행중입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break; //Exeption발생시 while문 빠져나가도록
			}
		}//while
	}//run

	public static void main(String[] args) {
		Thread t = new Thread(new DaemonThread());
		t.setDaemon(true);//데몬스레드 설정
		t.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드가 종료됩니다.");
	}
}
