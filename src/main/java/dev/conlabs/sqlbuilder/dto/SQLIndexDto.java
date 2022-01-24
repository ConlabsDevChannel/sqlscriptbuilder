package dev.conlabs.sqlbuilder.dto;

import java.util.Arrays;

public class SQLIndexDto {

	private String action;
	private String name;
	private String[] columns;
	
	public SQLIndexDto() {
		super();
	}

	public SQLIndexDto(String action, String name, String[] columns) {
		super();
		this.action = action;
		this.name = name;
		this.columns = columns;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getColumns() {
		return columns;
	}

	public void setColumns(String[] columns) {
		this.columns = columns;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SQLIndexDto [action=").append(action).append(", name=").append(name).append(", columns=")
				.append(Arrays.toString(columns)).append("]");
		return builder.toString();
	}
	
}
