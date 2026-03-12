class Student {
	private int id;
	private String name;
	private String mailId;
	private long contactNumber;
	private Project project;

	public Student() {

	}

	public Student(int id, String name, String mailId, long contactNumber) {
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}

	public void displayStudentInfo() {
		System.out.println();
		System.out.println("--------------");
		System.out.println("Student's Info");
		System.out.println("--------------");
		System.out.println("ID: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Mail ID: " + getMailId());
		System.out.println("Contact Number: " + getContactNumber());
	}

	public void createProject(Project project) {
		if(this.getProject() == null && project != null) {
			this.setProject(project);
			System.out.println("Project Created Successfully!");
		}
		else {
			System.out.println("Project not Created!");
		}
	}

	public void readProject() {
		if(this.getProject() != null) {
			this.getProject().displayProjectInfo();
		}
		else {
			System.out.println("Project can't be Displayed!");
		}
	}

	public void updateProject(int id, String name, String description) {
		if(id != 0 && name != null && description != null) {
			if(this.getProject().getId() == id) {
				System.out.println("Project's data Updated!");
				this.getProject().setName(name);
				this.getProject().setDescription(description);
			}
			else {
				System.out.println("Project Not Updated!");
			}
		}
		else {
			System.out.println("Invalid Data!");
		}
	}

	public void deleteProject(int id) {
		if(id > 0) {
			if(this.getProject().getId() == id){
				this.setProject(null);
				System.out.println("Project Deleted!");
			}
			else {
				System.out.println("Project Not Deleted!");
			}
		}
		else {
			System.out.println("Invalid Data!");
		}
	}

}