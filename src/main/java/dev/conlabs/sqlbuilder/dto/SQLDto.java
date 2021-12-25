package dev.conlabs.sqlbuilder.dto;

public record SQLDto (
	  String            name
	, String            requestDate
	, SQLTableDto       table
	, SQLConstraintsDto constarints
	, SQLIndexesDto     indexes
	, SQLSynonymDto     synonym
	, SQLGrantDto       grant
) {}
