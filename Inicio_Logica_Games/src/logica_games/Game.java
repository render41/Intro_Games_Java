package logica_games;

public class Game implements Runnable{
	private boolean isRunning;
	private Thread thread;
	
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
	
	public synchronized void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	
	//Atualiza o jogo
	public void tick() {
		System.out.println("Tick");
	}
	
	//Atualiza a renderização(apresentação gráfica)
	public void render() {
		System.out.println("Render");
	}

	@Override
	public void run() {
		while(isRunning) {
			tick();
			render();
			
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			
			
		}
		
	}
}
