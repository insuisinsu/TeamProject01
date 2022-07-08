package com.mybatis.join.VO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class DepartmentVO {
	
	private int		dno   ;
	private String	dname ;
	private String	loc   ;
	
	public DepartmentVO() {}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "DepartmentVO [dno=" + dno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	
}
