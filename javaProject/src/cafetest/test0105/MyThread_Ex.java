package cafetest.test0105;

public class MyThread_Ex extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + " ==> " + i);
		}
	}
}
