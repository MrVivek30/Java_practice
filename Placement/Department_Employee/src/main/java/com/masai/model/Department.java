package com.masai.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer depId;
	private String depName;
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Employee>employees;
}
