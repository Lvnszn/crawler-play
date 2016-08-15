package com.pjx.pattern;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

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
	
	public static Map<String, String> findUrlsByElements(Elements urls) {
		Map<String, String> urlMap = new HashMap<>();
		for(Element item:urls) {
			urlMap.put(item.attr("abs:href"), item.text());
		}
		return urlMap;
	}
	
	public static void main(String[] args) throws IOException {
		String aa = "//login.taobao.com/member/login.jhtml?f=top&amp;redirectURL=https%3A%2F%2Fwww.taobao.com%2F";
		Pattern pt = Pattern.compile("^\\//");
		System.out.println(pt.matcher(aa).find());
		
		Document doc = Jsoup.connect("http://www.lagou.com/").get();
//		System.out.println(doc.toString());
		Elements links = doc.select("a[href]");
//		Map<String, String> urlMap = findUrlsByElements(links);
        Elements media = doc.select("[src]");
        Elements imports = doc.select("link[href]");
		System.out.println(imports.attr("abs:href"));
	}
	
}
