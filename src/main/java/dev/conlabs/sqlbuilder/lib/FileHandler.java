package dev.conlabs.sqlbuilder.lib;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.conlabs.sqlbuilder.exception.FileExtensionNotSuppportedException;

public class FileHandler {
	
	public static String readTextFile(Path jsonFilePath) throws IOException {
		if(!jsonFilePath.getFileName().toString().endsWith("json")) {
			throw new FileExtensionNotSuppportedException("File Not Supported!");
		}
		
		List<String> jsonFile = Files.readAllLines(jsonFilePath);
		
		String result = "";
		
		for(String line: jsonFile) {
			result += line;
		}
		
		return result;
	}
	 
	public static String readTextFile(String filePath, String fileNameExtension) throws IOException {
		return readTextFile(Paths.get(filePath + "/" + fileNameExtension));
	}
	
	public static String readTextFile(String filePath, String fileName, String extension) throws IOException {
		return readTextFile(Paths.get(filePath + "/", fileName + "." + extension));
	}

}
