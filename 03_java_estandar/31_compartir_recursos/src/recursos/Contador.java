package recursos;

public class Contador {
	private int value;
	public void incrementar() {
		synchronized (this) {
			int temp = value;
			temp++;
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			value=temp;
		}		
	}
	public int getValue() {
		return value;
	}
}
