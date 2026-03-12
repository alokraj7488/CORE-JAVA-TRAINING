class JavaApplication {
	public static void execution() {
	
		Engine engine = new Engine(12000.00, 4, 1000);
		MediaPlayer mediaPlayer = new MediaPlayer("Boat", "India", 18349.873);
	
	// Dependency Injection - Constructor..!
		Car car = new Car("Hyundai-Creta", "Crimson", "India", 9578375.974, engine);
		car.displayCarInfo();
		car.getEngine().displayEngineInfo();

	// Dependency Injection - Setter Method..!
		car.setMediaPlayer(mediaPlayer);
		car.getMediaPlayer().displayMediaPlayerInfo();
	}
}