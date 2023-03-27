package com.masai.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer	flatId;
private String	buildingName;
@Min(value = 10,message = "no of rooms should be less than equalto 10")
private Integer noOfRooms;

private LocalDate date_of_manufacturing;
@Enumerated
private  FaceEnum Facing;
private Integer price;
private String	description;
}
