package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tutorial {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotNull
	private String title;
	@NotNull
	private String description;
	@NotNull
	private boolean published;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL)
	private List<Comments> comments=new ArrayList<>();
	
	

//	public Tutorial() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Tutorial(Integer id, @NotNull String title, @NotNull String description, @NotNull boolean published,
//			List<Comments> comments) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.description = description;
//		this.published = published;
//		this.comments = comments;
//	}

//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public boolean isPublished() {
//		return published;
//	}
//
//	public void setPublished(boolean published) {
//		this.published = published;
//	}
//
//	public List<Comments> getComments() {
//		return comments;
//	}
//
//	public void setComments(List<Comments> comments) {
//		this.comments = comments;
//	}
//
//	@Override
//	public String toString() {
//		return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", published=" + published
//				+ ", comments=" + comments + "]";
//	}
//	

}
