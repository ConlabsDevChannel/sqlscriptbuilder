package dev.conlabs.sqlbuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SQLScriptBuilderApplicationRunner {

	private static Logger logger = LoggerFactory.getLogger(SQLScriptBuilderApplicationRunner.class);
	
	public static void main(String[] args) {
		logger.debug("Application Runs At: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
	}
	
}
