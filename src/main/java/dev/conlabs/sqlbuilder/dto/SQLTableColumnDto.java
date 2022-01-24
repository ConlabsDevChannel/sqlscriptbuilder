package dev.conlabs.sqlbuilder.dto;

import java.util.Arrays;

public class SQLTableColumnDto {

	private String  name;
	private String  comment;
	private String  type;
	private int[]   length;
	private boolean nullable;
	private String  _default;
	
	public SQLTableColumnDto() {
		super();
	}

	public SQLTableColumnDto(String name, String comment, String type, int[] length, boolean nullable,
			String _default) {
		super();
		this.name = name;
		this.comment = comment;
		this.type = type;
		this.length = length;
		this.nullable = nullable;
		this._default = _default;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int[] getLength() {
		return length;
	}

	public void setLength(int[] length) {
		this.length = length;
	}

	public boolean isNullable() {
		return nullable;
	}

	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}

	public String get_default() {
		return _default;
	}

	public void set_default(String _default) {
		this._default = _default;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SQLTableColumnDto [name=").append(name).append(", comment=").append(comment).append(", type=")
				.append(type).append(", length=").append(Arrays.toString(length)).append(", nullable=").append(nullable)
				.append(", _default=").append(_default).append("]");
		return builder.toString();
	}
	
}
