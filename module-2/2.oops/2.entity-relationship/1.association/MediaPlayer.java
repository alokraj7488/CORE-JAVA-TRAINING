public class MediaPlayer {
	private String brand ;
	private String madeIn;
	private double price;

	public MediaPlayer(String brand, String madeIn, double price) {
		this.brand = brand;
		this.madeIn = madeIn;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMadeIn() {
		return madeIn;
	}
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public void displayMediaPlayerInfo() {
		System.out.println();
		System.out.println("----------------------");
		System.out.println("Media Player's Details");
		System.out.println("----------------------");
		System.out.println("Brand: " + brand);
		System.out.println("MadeIn: " + madeIn);
		System.out.println("Price: " + price);
	}
}