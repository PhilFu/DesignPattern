package com.designPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the flyweight factory class
 * 
 * @author DeBen
 *
 */
public class WebSiteFactory {
	private static Map<String, WebSite> webSites = new HashMap<String, WebSite>();

	public static WebSite createWebSite(String type) {
		WebSite webSite = webSites.get(type);
		if (webSite == null) {
			webSite = new ConcurrentWebSite(type);
			webSites.put(type, webSite);
		}
		return webSite;
	}

	public static int getCount() {
		return webSites.size();
	}
}
