package com.robomq;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.robomq.config.AppConfig;
import com.robomq.dao.MobileDAO;
import com.robomq.pojo.Mobile;




public class MobileJDBCMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MobileDAO mobileDAO = context.getBean(MobileDAO.class);
		
		System.out.println("List of Mobile is:");

		for (Mobile m : mobileDAO.getAllMobile()) {
			System.out.println(m);
		}
		
		System.out.println("\nGet mobile with ID 1");
		
		Mobile mobileById = mobileDAO.getMobileById(1);
		System.out.println(mobileById);
		
		System.out.println("\nCreating mobile: ");
		Mobile mobile = new Mobile(80, "Poco", 1800, 26, "Company");
		System.out.println(mobile);
		mobileDAO.createMobile(mobile);
		System.out.println("\nList of mobiles is:");
		
		for (Mobile m : mobileDAO.getAllMobile()) {
			System.out.println(m);
		}
		System.out.println("\nDeleting mobile with ID 78");
		mobileDAO.deleteMobile(mobileById);

		System.out.println("\nUpdate person with ID 80");

		Mobile mmobile = mobileDAO.getMobileById(80);
		mmobile.setName("Changed mobile name");
		mobileDAO.updateMobile(mmobile);
		
		System.out.println("\nList of mobile is:");
		for (Mobile m : mobileDAO.getAllMobile()) {
			System.out.println(m);
		}

		context.close();
		
	}

}
