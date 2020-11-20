package dasar;

public class game {
	public static void main(String[] args) {
		// membuat objek player
		player.Player cilsy = new player().new Player();
		// mengisi atribut player
		cilsy.name = "Cilsy";
		cilsy.speed = 90;
		cilsy.healthPoin = 0;
		// menjalankan method
		cilsy.run();
		if (cilsy.isDead()) {
			System.out.println("Game Over!");
		}
	}
}
