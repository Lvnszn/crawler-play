package com.pjx.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pjx.jpa.domain.HtmlDto;


public class PatternUtil {

	public static HtmlDto findUrlByElement(Element url) {
		HtmlDto htmlDto = new HtmlDto();
		htmlDto.setUrl(url.select("a[href]").attr("abs:href"));
		htmlDto.setTitle(url.select("a[href]").text());
		return htmlDto;
	}
	
	public static List<HtmlDto> findUrlsByElements(Elements urls) {
		List<HtmlDto> htmlDtos = new ArrayList<>();
		for(Element item:urls) {
			if(item.text()==null || item.attr("abs:href")==null) {
				continue;
			}
			HtmlDto htmlDto = new HtmlDto();
			htmlDto.setTitle(item.text());
			htmlDto.setUrl(item.attr("abs:href"));
			htmlDtos.add(htmlDto);
		}
		return htmlDtos;
	}
	
	
}
