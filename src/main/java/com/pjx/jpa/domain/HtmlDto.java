package com.pjx.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pc_url")
public class HtmlDto {

	@Id
	private Long id;
	
	@Column(nullable = false, name = "url", length = 512)
	private String url;
	
	@Column(nullable = false, name = "title", length = 256)
	private String title;

	@Column(nullable = true, name = "type", length = 256)
	private String type;
	
	@Column(nullable = true, name = "main_url", length = 256)
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return url + " + " + title;
	}

}
