class College {
	private int id;
	private String collegeName;
	private int numberOfDepartments;
	private String deanName; 
	private Department department;	

	public College() {

	}
	public College(int id, String collegeName, int numberOfDepartments, String deanName) {
		this.id = id;
		this.collegeName = collegeName;
		this.numberOfDepartments = numberOfDepartments;
		this.deanName = deanName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getNumberOfDepartments() {
		return numberOfDepartments;
	}
	public void setNumberOfDepartments(int numberOfDepartments) {
		this.numberOfDepartments = numberOfDepartments;
	}

	public String getDeanName() {
		
		return deanName;
	}
	public void setDeanName(String deanName) {
		this.deanName = deanName;
	}

	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	public void displayCollegeInfo() {
		System.out.println();
		System.out.println("--------------");
		System.out.println("College's Info");
		System.out.println("--------------");
		System.out.println("ID: " + getId());
		System.out.println("College Name: " + getCollegeName();
		System.out.println("Number Of Departments: " + getNumberOfDepartments;
		System.out.println("Dean Name: " + getDeanName());
	}

}