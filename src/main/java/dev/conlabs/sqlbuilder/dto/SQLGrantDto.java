package dev.conlabs.sqlbuilder.dto;

import java.util.ArrayList;

public class SQLGrantDto {
	private String owner;
	private String tablename;
	private ArrayList<SQLGrantTargetDto> target;
	
	public SQLGrantDto() {
		super();
	}

	public SQLGrantDto(String owner, String tablename, ArrayList<SQLGrantTargetDto> target) {
		super();
		this.owner = owner;
		this.tablename = tablename;
		this.target = target;
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

	public ArrayList<SQLGrantTargetDto> getTarget() {
		return target;
	}

	public void setTarget(ArrayList<SQLGrantTargetDto> target) {
		this.target = target;
	}

	@Override
	public String toString() {
		String targets = "target[totalsize=" + target.size() + "]\n";
		
		for(int i = 0; i < target.size(); i++) {
			targets += "target[" + i + "]\n";
			targets += target.toString() + "\n";			
		}
		
		
		return String.format("""
							 owner = %s
							 tablename = %s
							 target = %s
							 """, owner, tablename, target);

	}
	
}
