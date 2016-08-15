package com.spark.data;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pjx.jpa.bean.HtmlDto;
import com.pjx.service.HtmlService;

public class SparkDemo extends AbstractMJTestCase{
	@Autowired
	private HtmlService htmlService;
	
	@Test
	public void testDo() {
		HtmlDto hd = new HtmlDto();
		hd.setTitle("test");
		hd.setUrl("test");
		htmlService.addHtmlDto(hd);;
	}
}
