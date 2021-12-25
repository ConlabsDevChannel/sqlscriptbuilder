package dev.conlabs.sqlbuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.conlabs.sqlbuilder.dto.SQLDto;
import dev.conlabs.sqlbuilder.dto.SQLIndexesDto;

public class SQLScriptBuilderApplicationRunner {

	private static Logger logger = LoggerFactory.getLogger(SQLScriptBuilderApplicationRunner.class);
	
	public static void main(String[] args) {
		logger.debug("Application Runs At: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		
		SQLDto dto = new SQLDto(null, null, null, null, null, null, null);
		dto.indexes = new SQLIndexesDto();
	}
	
}
