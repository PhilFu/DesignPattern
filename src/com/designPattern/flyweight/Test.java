package com.designPattern.flyweight;

public class Test {

	public static void main(String[] args) {
		WebSite ws1 = WebSiteFactory.createWebSite("Business site");
		User user1 = new User("root", "root");
		ws1.use(user1);

		WebSite ws2 = WebSiteFactory.createWebSite("Business site");
		User user2 = new User("Admin", "Admin");
		ws2.use(user2);

		WebSite ws3 = WebSiteFactory.createWebSite("Business site");
		User user3 = new User("Slave", "Slave");
		ws3.use(user3);

		WebSite ws4 = WebSiteFactory.createWebSite("Personal site");
		User user4 = new User("person", "person");
		ws4.use(user4);

		WebSite ws5 = WebSiteFactory.createWebSite("Personal site");
		User user5 = new User("Phil", "Phil");
		ws5.use(user5);

		WebSite ws6 = WebSiteFactory.createWebSite("Personal site");
		User user6 = new User("shadow", "shadow");
		ws6.use(user6);

		System.out.println("WebSites instance count: "
				+ WebSiteFactory.getCount());
	}

}
