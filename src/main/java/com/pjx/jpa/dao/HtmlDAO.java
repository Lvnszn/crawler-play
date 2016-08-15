package com.pjx.jpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pjx.jpa.bean.HtmlDto;


public interface HtmlDao extends CrudRepository<HtmlDto, Long> {

//	public long count();
	
	public <S extends HtmlDto> S save(HtmlDto htmlDto);
	
//	public void saveHtmlDto(List<HtmlDto> HtmlDtolist);  
	
//	public void delete(HtmlDto htmlDto);
}
