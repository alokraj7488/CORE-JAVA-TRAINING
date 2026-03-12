class Department {
	private int id;
	private String departmentName;
	private int numberOfCourses;
	private String hodName; 
	private Student student;	

	public Department() {

	}
	public Department(int id, String departmentName, int numberOfCourses, String hodName) {
		this.id = id;
		this.departmentName = departmentName;
		this.numberOfCourses = numberOfCourses;
		this.hodName = hodName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getNumberOfCourses() {
		return numberOfCourses;
	}
	public void setNumberOfCourses(int numberOfCourses) {
		this.numberOfCourses = numberOfCourses;
	}

	public String getHodName() {
		return hodName;
	}
	public void setHodName(String hodName) {
		this.hodName = hodName;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	public void displayDepartmentInfo() {
		System.out.println();
		System.out.println("--------------");
		System.out.println("Department's Info");
		System.out.println("--------------");
		System.out.println("ID: " + getId());
		System.out.println("Department Name: " + getDepartmentName());
		System.out.println("Number Of Courses: " + getNumberOfCourses());
		System.out.println("HOD Name: " + getHodName());
	}
}