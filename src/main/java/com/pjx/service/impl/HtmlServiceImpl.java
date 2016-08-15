package com.pjx.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pjx.jpa.bean.HtmlDto;
import com.pjx.jpa.dao.HtmlDao;
import com.pjx.pattern.PatternUtil;
import com.pjx.service.HtmlService;

@Component("htmlService")
public class HtmlServiceImpl implements HtmlService {

	@Autowired
	private HtmlDao HtmlDao;
	
	public void doIt(Elements items) {
		addHtmlDto(PatternUtil.findUrlsByElements(items));
	}

	public static void main(String[] args) throws IOException {
		String aa = "//login.taobao.com/member/login.jhtml?f=top&amp;redirectURL=https%3A%2F%2Fwww.taobao.com%2F";
		Pattern pt = Pattern.compile("^\\//");
		System.out.println(pt.matcher(aa).find());
		Document doc = Jsoup.connect("http://www.51job.com/").get();
		
		Elements items = doc.select("a[href]");
//		System.out.println(items);
		HtmlServiceImpl a = new HtmlServiceImpl();
		a.doIt(items);
	}

	@Override
	public void addHtmlDto(HtmlDto htmlDto) {
		// TODO Auto-generated method stub
		HtmlDao.save(htmlDto);
	}

	@Override
	public void addHtmlDto(List<HtmlDto> htmlDtoList) {
		// TODO Auto-generated method stub
//		HtmlDao.saveHtmlDto(htmlDtoList);
	}
	
}
