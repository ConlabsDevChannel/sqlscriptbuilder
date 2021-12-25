package dev.conlabs.sqlbuilder.dto;

import java.util.Arrays;

public class SQLGrantTargetDto {

	private String roleUser;
	private String[] option;
	
	public SQLGrantTargetDto() {
		super();
	}

	public SQLGrantTargetDto(String roleUser, String[] option) {
		super();
		this.roleUser = roleUser;
		this.option = option;
	}

	public String getRoleUser() {
		return roleUser;
	}

	public void setRoleUser(String roleUser) {
		this.roleUser = roleUser;
	}

	public String[] getOption() {
		return option;
	}

	public void setOption(String[] option) {
		this.option = option;
	}

	@Override
	public String toString() {
		String optionsStr = "[";
		
		for(int i = 0 ; i < option.length; i++) {
			if(i == option.length-1) {
				optionsStr += option[i];
			} else {
				optionsStr += ","; 
			}
		}
		
		optionsStr += "]";
		
		return String.format("""
							 roleUser  = %s,
							 options[] = %s 
							 """, roleUser, optionsStr); 
	}
	
}
