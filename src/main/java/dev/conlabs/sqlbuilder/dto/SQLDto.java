package dev.conlabs.sqlbuilder.dto;

import java.util.ArrayList;

public class SQLDto {
	
	private String            		 name;
	private String            		 requestDate;
	private SQLTableDto       		 table;
	private SQLConstraintsDto 		 constarints;
	private SQLIndexesDto     		 indexes;
	private ArrayList<SQLSynonymDto> synonym;
	private ArrayList<SQLGrantDto>   grant;
	
	public SQLDto() {}

	public SQLDto(String name, String requestDate, SQLTableDto table, SQLConstraintsDto constarints,
			SQLIndexesDto indexes, ArrayList<SQLSynonymDto> synonym, ArrayList<SQLGrantDto> grant) {
		super();
		this.name = name;
		this.requestDate = requestDate;
		this.table = table;
		this.constarints = constarints;
		this.indexes = indexes;
		this.synonym = synonym;
		this.grant = grant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public SQLTableDto getTable() {
		return table;
	}

	public void setTable(SQLTableDto table) {
		this.table = table;
	}

	public SQLConstraintsDto getConstarints() {
		return constarints;
	}

	public void setConstarints(SQLConstraintsDto constarints) {
		this.constarints = constarints;
	}

	public SQLIndexesDto getIndexes() {
		return indexes;
	}

	public void setIndexes(SQLIndexesDto indexes) {
		this.indexes = indexes;
	}

	public ArrayList<SQLSynonymDto> getSynonym() {
		return synonym;
	}

	public void setSynonym(ArrayList<SQLSynonymDto> synonym) {
		this.synonym = synonym;
	}

	public ArrayList<SQLGrantDto> getGrant() {
		return grant;
	}

	public void setGrant(ArrayList<SQLGrantDto> grant) {
		this.grant = grant;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(this.getClass().getName()).append("\n")
		       .append("name=").append(name).append(false);
		
		
		return builder.toString();
	}
	
}
