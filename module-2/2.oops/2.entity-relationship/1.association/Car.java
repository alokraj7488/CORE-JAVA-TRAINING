public class Car {
	private String brand;
	private String color;
	private String madeIn;
	private double price;

	// public Car(String brand, String color, String madeIn, double price) {
	// 	this.brand = brand;
	// 	this.color = color;
	// 	this.madeIn = madeIn;
	// 	this.price = price;
	// }


// Car has an Engine..!
	
	// private Engine engine = new Engine(1200.00, 4, 5000);

// To initialize the engine value at the time of Car's object creation..!
	private Engine engine;
	public Car(String brand, String color, String madeIn, double price, Engine engine) {
		this.brand = brand;
		this.color = color;
		this.madeIn = madeIn;
		this.price = price;
		this.engine = engine;
	}


// Car has a Media Player..!
	private MediaPlayer mediaPlayer;


	public String getBrand() {
		return brand;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public MediaPlayer getMediaPlayer() {
		return mediaPlayer;
	}

	public void setMediaPlayer(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	public void displayCarInfo() {
		System.out.println();
		System.out.println("----------------------");
		System.out.println("Car's Details");
		System.out.println("----------------------");
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
		System.out.println("MadeIn: " + madeIn);
		System.out.println("Price: " + price);
	}
}