package com.example.demo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TODO {

	private int id;
	private String name;
	private String desc;
	private Date targetDate;

}
