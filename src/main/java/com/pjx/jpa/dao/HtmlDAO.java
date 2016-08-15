package com.pjx.jpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pjx.jpa.bean.HtmlDto;


public interface HtmlDao extends CrudRepository<HtmlDto, Long> {

	public long count();
	
	public void addHtmlDto(HtmlDto htmlDto);
	
	public void addHtmlDto(List<HtmlDto> HtmlDtolist);  
	
	public void deleteHtmlDto(HtmlDto htmlDto);
}
