package com.masai.Entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userID;
	@NotNull
	@Pattern(regexp = "[A-Za-z]+", message = "First Name must not contain numbers or special characters")
	private String firstName;
	@NotNull
	@Pattern(regexp = "[A-Za-z]+", message = "Last Name must not contain numbers or special characters")
	private String lastName;
	@Pattern(regexp = "^[6-9][0-9]{9}", message = "Mobile number must have 10 digits and must start from 6, 7, 8 or 9")
	private String mobileNumber;
	private Integer x_coordinate;
	private Integer y_coordinate;
	@Column(unique = true)
	private String email;
	@JsonProperty(access = Access.WRITE_ONLY)
	@Pattern(regexp ="((?=.[!@#$&])(?=.[A-Z])(?=.[a-z])(?=.*[0-9]).{8,15})", message = "Password should be alphanumeric and must contain 6-12 characters having at least one special character, one upper case, one lowercase, and one digit.")
	private String password;
	@Enumerated(EnumType.STRING)
	@JsonProperty(access = Access.WRITE_ONLY)
	private Role role;
	
	@OneToMany
	List<Booking> bookings = new ArrayList<>();
	
}
