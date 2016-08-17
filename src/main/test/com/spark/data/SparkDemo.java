package com.spark.data;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pjx.pattern.PatternUtil;
import com.pjx.service.HtmlService;

public class SparkDemo extends AbstractMJTestCase{
	@Autowired
	private HtmlService htmlService;
	
	@Test
	public void testDo() throws IOException {
		Document doc = Jsoup.connect("http://www.lagou.com/").get();
		Elements items = doc.select("a[href]");
		htmlService.addHtmlDto(PatternUtil.findUrlsByElements(items));
	}
}
