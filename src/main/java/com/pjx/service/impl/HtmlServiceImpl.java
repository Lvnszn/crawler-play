package com.pjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pjx.jpa.dao.HtmlDao;
import com.pjx.jpa.domain.HtmlDto;
import com.pjx.service.HtmlService;

@Component("htmlService")
public class HtmlServiceImpl implements HtmlService {

	@Autowired
	private HtmlDao HtmlDao;

	@Override
	public void addHtmlDto(List<HtmlDto> htmlDtoList) {
		HtmlDao.save(htmlDtoList);
	}
	
}
