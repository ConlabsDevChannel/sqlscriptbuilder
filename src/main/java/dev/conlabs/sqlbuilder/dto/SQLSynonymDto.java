package dev.conlabs.sqlbuilder.dto;

public class SQLSynonymDto {

	private String synonymOwner;
	private String originOwner;
	private String tableName;
	
	public SQLSynonymDto() {}

	public SQLSynonymDto(String synonymOwner, String originOwner, String tableName) {
		super();
		this.synonymOwner = synonymOwner;
		this.originOwner = originOwner;
		this.tableName = tableName;
	}

	public String getSynonymOwner() {
		return synonymOwner;
	}

	public void setSynonymOwner(String synonymOwner) {
		this.synonymOwner = synonymOwner;
	}

	public String getOriginOwner() {
		return originOwner;
	}

	public void setOriginOwner(String originOwner) {
		this.originOwner = originOwner;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Override
	public String toString() {
		return String.format("""
							 synonymOwner = %s
							 originOwner  = %s
							 tableName    = %s
							 """, synonymOwner, originOwner, tableName);
	}
	
}
