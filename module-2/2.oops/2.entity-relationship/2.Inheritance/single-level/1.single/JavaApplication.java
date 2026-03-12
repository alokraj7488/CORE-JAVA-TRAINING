class JavaApplication {
	plublic static void execution() {
		SoftwareTrainer softwareTrainer = new SoftwareTrainer();

		softwareTrainer.id = 1;
		softwareTrainer.name = "Rani";

		softwareTrainer.displaySoftwareTrainerInfo();

		SoftwareTrainer.entry();
		SoftwareTrainer.login();
		SoftwareTrainer.shortBreak();
		SoftwareTrainer.meeting();
		SoftwareTrainer.longBreak();

		softwareTrainer.task();
		softwareTrainer.reverseKT();

		SoftwareTrainer.logout();
		SoftwareTrainer.exit();
	}

}