package cafetest.test0105;

public class MyThread_Ex_Use {
	public static void main(String[] args) {
		MyThread_Ex ex1 = new MyThread_Ex();
		MyThread_Ex ex2 = new MyThread_Ex();
		
		ex1.setName("스레드1");
		ex2.setName("스레드2");
		
		ex1.setPriority(Thread.MAX_PRIORITY);
		ex2.setPriority(Thread.MIN_PRIORITY);
		
		ex1.start();
		ex2.start();
	}
}
