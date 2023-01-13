package cafetest.test0105;

public class MyThread_Im_Use {
	public static void main(String[] args) {
		MyThread_Im im1 = new MyThread_Im();
		
		Thread re1 = new Thread(im1, "스레드1");
		Thread re2 = new Thread(im1, "스레드2");
		
		re1.setPriority(Thread.MIN_PRIORITY);
		re2.setPriority(Thread.MAX_PRIORITY);
		
		re1.start();
		re2.start();
	}
}
