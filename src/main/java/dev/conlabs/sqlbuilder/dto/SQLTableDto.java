package dev.conlabs.sqlbuilder.dto;

import java.util.ArrayList;

public class SQLTableDto {

	private String owner;
	private String tablename;
	private String comment;
	private String tablespace;
	private ArrayList<SQLTableColumnDto> columns;
	
	public SQLTableDto() {
		super();
	}

	public SQLTableDto(String owner, String tablename, String comment, String tablespace,
			ArrayList<SQLTableColumnDto> columns) {
		super();
		this.owner = owner;
		this.tablename = tablename;
		this.comment = comment;
		this.tablespace = tablespace;
		this.columns = columns;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getTablespace() {
		return tablespace;
	}

	public void setTablespace(String tablespace) {
		this.tablespace = tablespace;
	}

	public ArrayList<SQLTableColumnDto> getColumns() {
		return columns;
	}

	public void setColumns(ArrayList<SQLTableColumnDto> columns) {
		this.columns = columns;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SQLTableDto [owner=").append(owner).append(", tablename=").append(tablename)
				.append(", comment=").append(comment).append(", tablespace=").append(tablespace).append(", columns=")
				.append(columns).append("]");
		return builder.toString();
	}
	
}
