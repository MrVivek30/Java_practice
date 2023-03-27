package com.masai.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comments {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotNull
	private String content;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private Tutorial tutorial;
//	public Comments() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Comments(Integer id, @NotNull String content, Tutorial tutorial) {
//		super();
//		this.id = id;
//		this.content = content;
//		this.tutorial = tutorial;
//	}
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getContent() {
//		return content;
//	}
//	public void setContent(String content) {
//		this.content = content;
//	}
//	public Tutorial getTutorial() {
//		return tutorial;
//	}
//	public void setTutorial(Tutorial tutorial) {
//		this.tutorial = tutorial;
//	}
//	@Override
//	public String toString() {
//		return "Comments [id=" + id + ", content=" + content + ", tutorial=" + tutorial + "]";
//	}
//	
//	

}
