class Employee {
	private int id;
	private String name;
	private long contactNumber;
	private String mailId;
	private String designation;

	public Employee(int id, String name, long contactNumber, String mailId, String designation) {
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.mailId = mailId;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getMailId() {
		return mailId;
	}

	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}