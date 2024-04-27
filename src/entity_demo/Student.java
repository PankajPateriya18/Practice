package entity_demo;

import java.util.Objects;

public class Student {

	private int studentId;
	private String studentName;
	private String fatherName;
	private String email;
	private String address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String fatherName, String email, String address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.email = email;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", fatherName=" + fatherName
				+ ", email=" + email + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, email, fatherName, studentId, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(fatherName, other.fatherName) && studentId == other.studentId
				&& Objects.equals(studentName, other.studentName);
	}
	
	
}
