package dev.conlabs.sqlbuilder.dto;

import java.util.ArrayList;

public class SQLConstraintsDto {

	private String owner;
	private String tableName;
	private ArrayList<SQLConsConstraintDto> constraint;
	
	public SQLConstraintsDto() {
		super();
	}

	public SQLConstraintsDto(String owner, String tableName, ArrayList<SQLConsConstraintDto> constraint) {
		super();
		this.owner = owner;
		this.tableName = tableName;
		this.constraint = constraint;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public ArrayList<SQLConsConstraintDto> getConstraint() {
		return constraint;
	}

	public void setConstraint(ArrayList<SQLConsConstraintDto> constraint) {
		this.constraint = constraint;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SQLConstraintsDto [owner=").append(owner).append(", tableName=").append(tableName)
				.append(", constraint=").append(constraint).append("]");
		return builder.toString();
	}
	
}
