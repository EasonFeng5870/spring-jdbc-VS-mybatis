package thread;

import java.util.HashMap;

public class TestThread {
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		HashMap<String, Object> map = MyThread.threadLocal.get();
		System.out.println(map.get("a") + "--");
	}
	
	public static void oneThread(){
		Thread t = new Thread("a test thread"){
			public void run(){
				int i = 0;
				while(true){
					i++;
					System.out.println("this is a good syso:" + i);
					
//					try {
//						Thread.sleep(3000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
					
				}
			}
		};
		t.start();
		System.out.println(t.getPriority());
	}
	
	static class MyThread extends Thread {
		static ThreadLocal<HashMap<String, Object>> threadLocal = new ThreadLocal<HashMap<String,Object>>();
		
		public MyThread(){
			super("MyThread--");
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("a", 1);
			threadLocal.set(map);
		}
		public void run(){
			int i = 0;
			while(true){
				i++;
//				System.out.println("this is a good syso:" + i);
				
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				if(Thread.interrupted()){
					System.out.println("thread(a test thread) is interrupted ");
					try {
						throw new Exception();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
