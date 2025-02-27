package tareas;

public class TareaAscendente implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Ascendente " + i);
			// Para retardar cada iteración y ver mejor la multitarea
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
