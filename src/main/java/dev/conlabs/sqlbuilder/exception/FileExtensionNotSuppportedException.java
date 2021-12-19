package dev.conlabs.sqlbuilder.exception;

import java.io.IOException;

public class FileExtensionNotSuppportedException extends IOException {

	private static final long serialVersionUID = 8568014749768192696L;

	public FileExtensionNotSuppportedException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileExtensionNotSuppportedException(String message) {
		super(message);
	}
	
}
