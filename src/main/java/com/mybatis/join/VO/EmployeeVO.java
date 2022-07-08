package com.mybatis.join.VO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EmployeeVO {

	private int eno           ;
	private String ename         ;
	private String job           ;
	private int manager       ;
	private String hiredate      ;
	private int salary        ;
	private int commission    ;
	private int dno           ;
	
	public EmployeeVO() {}
	
	

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getManager() {
		return manager;
	}

	public void setManager(int manager) {
		this.manager = manager;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	@Override
	public String toString() {
		return "EmployeeVO [eno=" + eno + ", ename=" + ename + ", job=" + job + ", manager=" + manager + ", hiredate="
				+ hiredate + ", salary=" + salary + ", commission=" + commission + ", dno=" + dno + "]";
	}
	
	
	
}
