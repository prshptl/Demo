package com.qa.amazon.logger;
/*
 *
 * This class is developed for Log4j logger to write execution log in console and log file.
 */
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

import static com.qa.amazon.constants.Constants.LOGGER;

public class Log4j {

	@SuppressWarnings("rawtypes")
	public static Logger initLog4j(Class cl) {
		
		Logger log = Logger.getLogger(cl);
		PropertyConfigurator.configure(LOGGER);
		return log;	
	}
}
