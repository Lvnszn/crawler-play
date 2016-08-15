package com.pjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pjx.jpa.bean.HtmlDto;
import com.pjx.jpa.dao.HtmlDao;
import com.pjx.service.HtmlService;

@Component(value = "htmlService")
public class HtmlServiceImpl implements HtmlService {

	@Autowired
	private HtmlDao HtmlDao;
	
	@Override
	public void addHtmlDto(HtmlDto htmlDto) {
		HtmlDao.addHtmlDto(htmlDto);
	}

	@Override
	public void addHtmlDto(List<HtmlDto> htmlDtoList) {
		HtmlDao.addHtmlDto(htmlDtoList);
	}

}
