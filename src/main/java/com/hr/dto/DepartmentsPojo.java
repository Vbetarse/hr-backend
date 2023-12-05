package com.hr.dto;

import lombok.Data;

@Data

public class DepartmentsPojo {
	private int departmentId;
	private String departmentName;
	private EmployeesPojo employeesPojo;
	private LocationsPojo locationsPojo;
}
