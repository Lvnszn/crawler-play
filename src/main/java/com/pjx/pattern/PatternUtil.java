package com.pjx.pattern;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pjx.jpa.bean.HtmlDto;


public class PatternUtil {

	//get first item within \"
	private static Pattern URL_PATTERN = Pattern.compile("(\"[^\"]*\")");
	//start with //
	private static Pattern PRE_FIEX = Pattern.compile("^\\//");
	
	public static String findUrlByElement(Element url) {
		Matcher matcher = URL_PATTERN.matcher(url.toString());
		StringBuilder result = new StringBuilder();
		if(matcher.find()) {
			if(PRE_FIEX.matcher(matcher.group().toString()).find()) {
				result.append("http:").append(matcher.group());
			} else {
				result.append(matcher.group());
			}
		}
		return result.toString();
	}
	
	public static List<HtmlDto> findUrlsByElements(Elements urls) {
		List<HtmlDto> htmlDtos = new ArrayList<>();
		for(Element item:urls) {
			HtmlDto htmlDto = new HtmlDto();
			htmlDto.setTitle(item.text());
			htmlDto.setMainUrl(item.attr("abs:href"));
			htmlDtos.add(htmlDto);
		}
		return htmlDtos;
	}
	
	
}
