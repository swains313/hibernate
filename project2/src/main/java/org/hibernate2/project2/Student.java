package org.hibernate2.project2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="sid")
	private Integer sid;
	@Column(name="sname")
	private String sname;
	@Column(name="sper")
	private Double sper;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Double getSper() {
		return sper;
	}
	public void setSper(Double sper) {
		this.sper = sper;
	}
	

}
