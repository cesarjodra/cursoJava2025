package recursos;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Contador {
	private int value;
	private Lock lc = new ReentrantLock();
	public void incrementar() {
		lc.lock();
			int temp = value;
			temp++;
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			value=temp;
		lc.unlock();
	}
	public int getValue() {
		return value;
	}
}
