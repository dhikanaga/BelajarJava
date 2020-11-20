package cobaInterface;

public class Samseng implements Phone {

	private int volume;
	private boolean isPowerOn;

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		isPowerOn = true;
		System.out.println("Handphone menyala...");
		System.out.println("Selamat datang di Samseng");
		System.out.println("Android version 10");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		isPowerOn = false;
		System.out.println("Handphone dimatikan");

	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if (isPowerOn) {
			if (this.volume == MAX_VOLUME) {
				System.out.println("Volume FULL!!");
				System.out.println("sudah " + this.getVolume() + "%");
			} else {
				this.volume += 10;
				System.out.println("Volume sekarang: " + this.getVolume());
			}
		} else {
			System.out.println("Nyalakan dulu HP-nya!!");
		}

	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if (isPowerOn) {
			if (this.volume == MIN_VOLUME) {
				System.out.println("Volume = 0%");
			} else {
				this.volume -= 10;
				System.out.println("Volume sekarang: " + this.getVolume());
			}
		} else {
			System.out.println("Nyalakan dulu HP-nya!!");
		}

	}

	public int getVolume() {
		return this.volume;
	}

}
