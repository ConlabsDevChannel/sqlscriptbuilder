package dev.conlabs.sqlbuilder.dto;

import java.util.ArrayList;

public class SQLIndexesDto {

	private String owner;
	private String tablename;
	private String tablespace;
	private ArrayList<SQLIndexDto> index;
	
	public SQLIndexesDto() {
		super();
	}

	public SQLIndexesDto(String owner, String tablename, String tablespace, ArrayList<SQLIndexDto> index) {
		super();
		this.owner = owner;
		this.tablename = tablename;
		this.tablespace = tablespace;
		this.index = index;
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

	public String getTablespace() {
		return tablespace;
	}

	public void setTablespace(String tablespace) {
		this.tablespace = tablespace;
	}

	public ArrayList<SQLIndexDto> getIndex() {
		return index;
	}

	public void setIndex(ArrayList<SQLIndexDto> index) {
		this.index = index;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SQLIndexesDto [owner=").append(owner).append(", tablename=").append(tablename)
				.append(", tablespace=").append(tablespace).append(", index=").append(index).append("]");
		return builder.toString();
	}
	
}
