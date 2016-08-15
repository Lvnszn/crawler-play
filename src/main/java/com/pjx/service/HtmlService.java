package com.pjx.service;

import java.util.List;

import com.pjx.jpa.bean.HtmlDto;

public interface HtmlService {

	public void addHtmlDto(HtmlDto htmlDto);
	
	public void addHtmlDto(List<HtmlDto> htmlDtoList);
}
