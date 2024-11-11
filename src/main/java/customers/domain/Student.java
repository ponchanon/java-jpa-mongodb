package customers.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
    @Id
    private int studentId;
    private String name;
    private String phone;
    private String email;
    private Address address;

    public Student() {
    }

    public Student(int studentId, String name, String phone, String email) {
        this.studentId = studentId;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
	public String toString() {
		return "Student{" +
				"StudentId=" + studentId +
				", name='" + name + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", StudentId=" + studentId +
				'}';
	}

	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
}
