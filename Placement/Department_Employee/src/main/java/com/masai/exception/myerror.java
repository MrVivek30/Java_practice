package com.masai.exception;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class myerror {

	private String msg;
	private String desc;
	private LocalDate timestamp;
}