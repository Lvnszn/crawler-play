package com.pjx.jsoup;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.pjx.pattern.PatternUtil;

@Service(value = "htmlDao")
public class JsoupCrawler {

	
		
	
	
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
