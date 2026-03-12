class JavaApplication {
	public static void execution() {
		Student student = new Student(1, "John", "john@gmail.com", 9876554321l);
		student.displayStudentInfo();

		Project project = new Project(1, "E-Commerce", "Java based Web Application");
		student.createProject(project);
		student.readProject();
		student.updateProject(1, "Airlines Management System", "JavaScript based Web Application");
		student.readProject();
		student.deleteProject(1);
		student.readProject();
	}
}