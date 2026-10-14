package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	@Value("${deptId}")
	int deptId;
	
	@Value("${dept}")
	String dept;

	public Department() {
		super();
	}

	public Department(int deptId, String dept) {
		super();
		this.deptId = deptId;
		this.dept = dept;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dept=" + dept + "]";
	}

	
	
	
}
