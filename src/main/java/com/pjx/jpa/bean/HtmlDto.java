package com.pjx.jpa.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pc_url")
public class HtmlDto {

	@Id
	@GeneratedValue
	private String id;
	
	@Column(nullable = false, name = "urls", length = 512)
	private String url;
	
	@Column(nullable = false, name = "title", length = 256)
	private String title;

	@Column(nullable = false, name = "type", length = 256)
	private String type;
	
	@Column(nullable = false, name = "main_url", length = 256)
	private String mainUrl;
	
	public String getMainUrl() {
		return mainUrl;
	}

	public void setMainUrl(String mainUrl) {
		this.mainUrl = mainUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
