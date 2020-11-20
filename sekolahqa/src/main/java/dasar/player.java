package dasar;

public class player {
	public class Player {
		// definisi atribut
		public String name;
		public int speed;
		public int healthPoin;

		// definisi method run
		void run() {
			System.out.println(name + " is running...");
			System.out.println("Speed: " + speed);
		}

		boolean isDead() {
			if (healthPoin <= 0)return true;
			return false;
		}
	}
}