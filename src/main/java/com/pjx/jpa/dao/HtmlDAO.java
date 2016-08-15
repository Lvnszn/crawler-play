package com.pjx.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.pjx.jpa.bean.HtmlDto;


public interface HtmlDAO extends CrudRepository<HtmlDto, Long> {

	public int countById(Long id);
	
}
