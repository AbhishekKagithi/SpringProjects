package com.sathya.spring;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//
//@Setter
//@Getter
//@AllArgsConstructor
//@ToString
//@NoArgsConstructor
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder

public class Employee {
	
		private int empId;
		private String empName;
		private double empSalary;
		

}
