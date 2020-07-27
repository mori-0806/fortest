package Thread;

public class Demo01Thread {
	public static void main(String[] args) {
		System.out.println("Demo01Thread.main()");
		MyThread mt = new MyThread();
		mt.run();
		mt.start();
	
		for (int i = 0; i < 20; i++) {
			System.out.println("main" +i);
		}
	}

}
