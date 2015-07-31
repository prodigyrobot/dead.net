package com.allinfofree.core;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.allinfofree.core.model.Shadow;
import com.allinfofree.core.services.InfoService;

/**
 * Hello world!
 *
 */
public class App {
    
	public static void main( String[] args ){
    	
    	ApplicationContext ctx = new GenericXmlApplicationContext("app.xml");
    	
    	InfoService service = ctx.getBean("infoService", InfoService.class);
    	
    	Shadow sh = service.addShadow(UUID.randomUUID(), "shadow");
    	
    	
    	
    }
	
}
