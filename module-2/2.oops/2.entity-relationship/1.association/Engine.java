public class Engine {
	private double cc;
	private int cylinderCount;
	private int hp;

	public Engine(double cc, int cylinderCount, int hp) {
		this.cc = cc;
		this.cylinderCount = cylinderCount;
		this.hp = hp;
	}

	public double getCc() {
		return cc;
	}

	public int getCylinderCount() {
		return cylinderCount;
	}

	public int getHp() {
		return hp;
	}

	public void displayEngineInfo() {
		System.out.println();
		System.out.println("----------------");
		System.out.println("Engine's Details");
		System.out.println("----------------");
		System.out.println("CC: " + cc);
		System.out.println("Cylinder Count: " + cylinderCount);
		System.out.println("Hp: " + hp);
	}
}