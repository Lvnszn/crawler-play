package com.pjx.jpa.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company_info")
public class CompanyContentDto {

	@Id
	@GeneratedValue
	private String id;
	
	@Column(nullable = false, name = "company_name", length = 256)
	private String companyName;//公司名字
	
	@Column(nullable = false, name = "job_name", length = 256)
	private String jobName;//工作名字
	
	@Column(nullable = false, name = "content", length = 256)
	private String content;//工作的说明
	
	@Column(nullable = false, name = "address", length = 256)
	private String address;//工作的地址
	
	@Column(nullable = false, name = "salary", length = 256)
	private String salary;//工作的薪水
	
	@Column(nullable = false, name = "experience", length = 256)
	private String experience;//工作经验
	
	@Column(nullable = false, name = "company_name")
	private Date time;//发布时间
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public boolean isBigCompany() {
		return isBigCompany;
	}

	public void setBigCompany(boolean isBigCompany) {
		this.isBigCompany = isBigCompany;
	}

	private boolean isBigCompany;
	
}
