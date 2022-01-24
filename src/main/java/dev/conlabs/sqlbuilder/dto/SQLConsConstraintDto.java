package dev.conlabs.sqlbuilder.dto;

import java.util.Arrays;

public class SQLConsConstraintDto {

	private String action;
	private String type;
	private String name;
	private String[] columns;
	private String additionalCommand;
	
	public SQLConsConstraintDto() {
		super();
	}

	public SQLConsConstraintDto(String action, String type, String name, String[] columns, String additionalCommand) {
		super();
		this.action = action;
		this.type = type;
		this.name = name;
		this.columns = columns;
		this.additionalCommand = additionalCommand;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getAdditionalCommand() {
		return additionalCommand;
	}

	public void setAdditionalCommand(String additionalCommand) {
		this.additionalCommand = additionalCommand;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SQLConsConstraintDto [action=").append(action).append(", type=").append(type).append(", name=")
				.append(name).append(", columns=").append(Arrays.toString(columns)).append(", additionalCommand=")
				.append(additionalCommand).append("]");
		return builder.toString();
	}
	
}
