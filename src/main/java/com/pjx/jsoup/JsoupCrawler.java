package com.pjx.jsoup;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pjx.pattern.PatternUtil;

public class JsoupCrawler {

	
	public static void main(String[] args) throws IOException {

//		Pattern pattern = Pattern.compile("(href)");
//		String url = "<a href=\"index.html\">主页</a>";
		Document doc = Jsoup.connect("http://login.taobao.com/member/login.jhtml?f=top&amp;redirectURL=https%3A%2F%2Fwww.taobao.com%2F").get();
//		System.out.println(doc.toString());
		Elements links = doc.select("a[href]");
//		Matcher mc = chinese.matcher(url);
//		Matcher mc = pattern.matcher(url);
//		System.out.println(mc.find()?mc.group():0);
		System.out.println(links.toString());
	}
	
	public Document handlePage(String url) throws IOException {
		Document doc = Jsoup.connect(url).get();
		return doc;
	}
	
	public Elements getURLs(Document doc) {
		Elements links = doc.select("a[href]");
		for(Element link : links) {
			PatternUtil.findUrlByElement(link);
		}
		
		return links;
	}
}
