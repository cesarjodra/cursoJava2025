package tareas;

public class TareaDescendente  implements Runnable {

	@Override
	public void run() {
		for(int i=100;i>=1;i--) {
			System.out.println("Descendente " + i);
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
