package com.company.crm.server.remoteservice;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;




public class LoggerInit implements ServletContextListener {
	
	static Logger logger = Logger.getLogger(LoggerInit.class);
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		try {
			InputStream inStreem = null;
			if(System.getProperty("log4j.properties") != null) {
				inStreem = new FileInputStream(System.getProperty("log4j.properties"));							
			} else {
				inStreem = Thread.currentThread().getContextClassLoader().getResourceAsStream(
						"log4j.properties");
			}
			Properties log4jProperties = new Properties();			
			log4jProperties.load(inStreem);
			PropertyConfigurator.configure(log4jProperties);
			logger.info("log4j logging has been initialized");
		} catch (Exception e) {
			logger.error("log4j logging was not initialized", e);
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

}
