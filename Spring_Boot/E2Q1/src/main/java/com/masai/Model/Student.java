package com.masai.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	@NotBlank(message = "Name is mandatory")
    @Size(min = 3, max = 10, message = "Name should be between 3 and 10 characters")
    private String StudentName;
	
	@Valid
	private Address address;
	
    @NotNull(message = "Age is mandatory")
    @Min(value = 13, message = "Age should be greater than 12")
    private Integer age;
    
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be in proper format")
    private String email;
    
    @NotBlank(message = "Mobile number is mandatory")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Mobile number should be 10 digit length and should start with either 6, 7, 8 or 9")
    private String mobileNumber;
    
    @Enumerated(EnumType.STRING)
    private Gender gender;
   
    
    @NotBlank(message = "Date Of Birth is mandatory")
    private LocalDate dob;

//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Student(Integer studentId,
//			@NotBlank(message = "Name is mandatory") @Size(min = 3, max = 10, message = "Name should be between 3 and 10 characters") String studentName,
//			@Valid Address address,
//			@NotNull(message = "Age is mandatory") @Min(value = 13, message = "Age should be greater than 12") Integer age,
//			@NotBlank(message = "Email is mandatory") @Email(message = "Email should be in proper format") String email,
//			@NotBlank(message = "Mobile number is mandatory") @Pattern(regexp = "^[6-9]\\d{9}$", message = "Mobile number should be 10 digit length and should start with either 6, 7, 8 or 9") String mobileNumber,
//			Gender gender, @NotBlank(message = "Date Of Birth is mandatory") LocalDate dob) {
//		super();
//		this.studentId = studentId;
//		StudentName = studentName;
//		this.address = address;
//		this.age = age;
//		this.email = email;
//		this.mobileNumber = mobileNumber;
//		this.gender = gender;
//		this.dob = dob;
//	}
//
//	public Integer getStudentId() {
//		return studentId;
//	}
//
//	public void setStudentId(Integer studentId) {
//		this.studentId = studentId;
//	}
//
//	public String getStudentName() {
//		return StudentName;
//	}
//
//	public void setStudentName(String studentName) {
//		StudentName = studentName;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//
//	public Integer getAge() {
//		return age;
//	}
//
//	public void setAge(Integer age) {
//		this.age = age;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getMobileNumber() {
//		return mobileNumber;
//	}
//
//	public void setMobileNumber(String mobileNumber) {
//		this.mobileNumber = mobileNumber;
//	}
//
//	public Gender getGender() {
//		return gender;
//	}
//
//	public void setGender(Gender gender) {
//		this.gender = gender;
//	}
//
//	public LocalDate getDob() {
//		return dob;
//	}
//
//	public void setDob(LocalDate dob) {
//		this.dob = dob;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", address=" + address + ", age="
//				+ age + ", email=" + email + ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", dob=" + dob
//				+ "]";
//	}
//    
//    
    
	
}
