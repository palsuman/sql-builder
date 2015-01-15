package com.suman.sql.builder.keyword;

/**
 * The Enum SQL KeyWord.
 */
public enum KeyWord {

	/** The add. */
	ADD("ADD"),

	/** The external. */
	EXTERNAL("EXTERNAL"),

	/** The procedure. */
	PROCEDURE("PROCEDURE"),

	/** The all. */
	ALL("ALL"),

	/** The fetch. */
	FETCH("FETCH"),

	/** The public. */
	PUBLIC("PUBLIC"),

	/** The alter. */
	ALTER("ALTER"),

	/** The file. */
	FILE("FILE"),

	/** The raiserror. */
	RAISERROR("RAISERROR"),

	/** The and. */
	AND("AND"),

	/** The fillfactor. */
	FILLFACTOR("FILLFACTOR"),

	/** The read. */
	READ("READ"),

	/** The any. */
	ANY("ANY"),

	/** The for. */
	FOR("FOR"),

	/** The readtext. */
	READTEXT("READTEXT"),

	/** The as. */
	AS("AS"),

	/** The foreign. */
	FOREIGN("FOREIGN"),

	/** The reconfigure. */
	RECONFIGURE("RECONFIGURE"),

	/** The asc. */
	ASC("ASC"),

	/** The freetext. */
	FREETEXT("FREETEXT"),

	/** The references. */
	REFERENCES("REFERENCES"),

	/** The authorization. */
	AUTHORIZATION("AUTHORIZATION"),

	/** The freetexttable. */
	FREETEXTTABLE("FREETEXTTABLE"),

	/** The replication. */
	REPLICATION("REPLICATION"),

	/** The backup. */
	BACKUP("BACKUP"),

	/** The from. */
	FROM("FROM"),

	/** The restore. */
	RESTORE("RESTORE"),

	/** The begin. */
	BEGIN("BEGIN"),

	/** The full. */
	FULL("FULL"),

	/** The restrict. */
	RESTRICT("RESTRICT"),

	/** The between. */
	BETWEEN("BETWEEN"),

	/** The function. */
	FUNCTION("FUNCTION"),

	/** The return. */
	RETURN("RETURN"),

	/** The break. */
	BREAK("BREAK"),

	/** The goto. */
	GOTO("GOTO"),

	/** The revert. */
	REVERT("REVERT"),

	/** The browse. */
	BROWSE("BROWSE"),

	/** The grant. */
	GRANT("GRANT"),

	/** The revoke. */
	REVOKE("REVOKE"),

	/** The bulk. */
	BULK("BULK"),

	/** The group. */
	GROUP("GROUP"),

	/** The right. */
	RIGHT("RIGHT"),

	/** The by. */
	BY("BY"),

	/** The having. */
	HAVING("HAVING"),

	/** The rollback. */
	ROLLBACK("ROLLBACK"),

	/** The cascade. */
	CASCADE("CASCADE"),

	/** The holdlock. */
	HOLDLOCK("HOLDLOCK"),

	/** The rowcount. */
	ROWCOUNT("ROWCOUNT"),

	/** The case. */
	CASE("CASE"),

	/** The identity. */
	IDENTITY("IDENTITY"),

	/** The rowguidcol. */
	ROWGUIDCOL("ROWGUIDCOL"),

	/** The check. */
	CHECK("CHECK"),

	/** The identity insert. */
	IDENTITY_INSERT("IDENTITY_INSERT"),

	/** The rule. */
	RULE("RULE"),

	/** The checkpoint. */
	CHECKPOINT("CHECKPOINT"),

	/** The identitycol. */
	IDENTITYCOL("IDENTITYCOL"),

	/** The save. */
	SAVE("SAVE"),

	/** The close. */
	CLOSE("CLOSE"),

	/** The if. */
	IF("IF"),

	/** The schema. */
	SCHEMA("SCHEMA"),

	/** The clustered. */
	CLUSTERED("CLUSTERED"),

	/** The in. */
	IN("IN"),

	/** The securityaudit. */
	SECURITYAUDIT("SECURITYAUDIT"),

	/** The coalesce. */
	COALESCE("COALESCE"),

	/** The index. */
	INDEX("INDEX"),

	/** The select. */
	SELECT("SELECT"),

	/** The collate. */
	COLLATE("COLLATE"),

	/** The inner. */
	INNER("INNER"),

	/** The semantickeyphrasetable. */
	SEMANTICKEYPHRASETABLE("SEMANTICKEYPHRASETABLE"),

	/** The column. */
	COLUMN("COLUMN"),

	/** The insert. */
	INSERT("INSERT"),

	/** The semanticsimilaritydetailstable. */
	SEMANTICSIMILARITYDETAILSTABLE("SEMANTICSIMILARITYDETAILSTABLE"),

	/** The commit. */
	COMMIT("COMMIT"),

	/** The intersect. */
	INTERSECT("INTERSECT"),

	/** The semanticsimilaritytable. */
	SEMANTICSIMILARITYTABLE("SEMANTICSIMILARITYTABLE"),

	/** The compute. */
	COMPUTE("COMPUTE"),

	/** The into. */
	INTO("INTO"),

	/** The session user. */
	SESSION_USER("SESSION_USER"),

	/** The constraint. */
	CONSTRAINT("CONSTRAINT"),

	/** The is. */
	IS("IS"),

	/** The set. */
	SET("SET"),

	/** The contains. */
	CONTAINS("CONTAINS"),

	/** The join. */
	JOIN("JOIN"),

	/** The setuser. */
	SETUSER("SETUSER"),

	/** The containstable. */
	CONTAINSTABLE("CONTAINSTABLE"),

	/** The key. */
	KEY("KEY"),

	/** The shutdown. */
	SHUTDOWN("SHUTDOWN"),

	/** The continue. */
	CONTINUE("CONTINUE"),

	/** The kill. */
	KILL("KILL"),

	/** The some. */
	SOME("SOME"),

	/** The convert. */
	CONVERT("CONVERT"),

	/** The left. */
	LEFT("LEFT"),

	/** The statistics. */
	STATISTICS("STATISTICS"),

	/** The create. */
	CREATE("CREATE"),

	/** The like. */
	LIKE("LIKE"),

	/** The system user. */
	SYSTEM_USER("SYSTEM_USER"),

	/** The cross. */
	CROSS("CROSS"),

	/** The lineno. */
	LINENO("LINENO"),

	/** The table. */
	TABLE("TABLE"),

	/** The current. */
	CURRENT("CURRENT"),

	/** The load. */
	LOAD("LOAD"),

	/** The tablesample. */
	TABLESAMPLE("TABLESAMPLE"),

	/** The current date. */
	CURRENT_DATE("CURRENT_DATE"),

	/** The merge. */
	MERGE("MERGE"),

	/** The textsize. */
	TEXTSIZE("TEXTSIZE"),

	/** The current time. */
	CURRENT_TIME("CURRENT_TIME"),

	/** The national. */
	NATIONAL("NATIONAL"),

	/** The then. */
	THEN("THEN"),

	/** The current timestamp. */
	CURRENT_TIMESTAMP("CURRENT_TIMESTAMP"),

	/** The nocheck. */
	NOCHECK("NOCHECK"),

	/** The to. */
	TO("TO"),

	/** The current user. */
	CURRENT_USER("CURRENT_USER"),

	/** The nonclustered. */
	NONCLUSTERED("NONCLUSTERED"),

	/** The top. */
	TOP("TOP"),

	/** The cursor. */
	CURSOR("CURSOR"),

	/** The not. */
	NOT("NOT"),

	/** The tran. */
	TRAN("TRAN"),

	/** The database. */
	DATABASE("DATABASE"),

	/** The null. */
	NULL("NULL"),

	/** The transaction. */
	TRANSACTION("TRANSACTION"),

	/** The dbcc. */
	DBCC("DBCC"),

	/** The nullif. */
	NULLIF("NULLIF"),

	/** The trigger. */
	TRIGGER("TRIGGER"),

	/** The deallocate. */
	DEALLOCATE("DEALLOCATE"),

	/** The of. */
	OF("OF"),

	/** The truncate. */
	TRUNCATE("TRUNCATE"),

	/** The declare. */
	DECLARE("DECLARE"),

	/** The off. */
	OFF("OFF"),

	/** The try convert. */
	TRY_CONVERT("TRY_CONVERT"),

	/** The default. */
	DEFAULT("DEFAULT"),

	/** The offsets. */
	OFFSETS("OFFSETS"),

	/** The tsequal. */
	TSEQUAL("TSEQUAL"),

	/** The delete. */
	DELETE("DELETE"),

	/** The on. */
	ON("ON"),

	/** The union. */
	UNION("UNION"),

	/** The deny. */
	DENY("DENY"),

	/** The open. */
	OPEN("OPEN"),

	/** The unique. */
	UNIQUE("UNIQUE"),

	/** The desc. */
	DESC("DESC"),

	/** The opendatasource. */
	OPENDATASOURCE("OPENDATASOURCE"),

	/** The unpivot. */
	UNPIVOT("UNPIVOT"),

	/** The disk. */
	DISK("DISK"),

	/** The openquery. */
	OPENQUERY("OPENQUERY"),

	/** The update. */
	UPDATE("UPDATE"),

	/** The distinct. */
	DISTINCT("DISTINCT"),

	/** The openrowset. */
	OPENROWSET("OPENROWSET"),

	/** The updatetext. */
	UPDATETEXT("UPDATETEXT"),

	/** The distributed. */
	DISTRIBUTED("DISTRIBUTED"),

	/** The openxml. */
	OPENXML("OPENXML"),

	/** The use. */
	USE("USE"),

	/** The double. */
	DOUBLE("DOUBLE"),

	/** The option. */
	OPTION("OPTION"),

	/** The user. */
	USER("USER"),

	/** The drop. */
	DROP("DROP"),

	/** The or. */
	OR("OR"),

	/** The values. */
	VALUES("VALUES"),

	/** The dump. */
	DUMP("DUMP"),

	/** The order. */
	ORDER("ORDER"),

	/** The varying. */
	VARYING("VARYING"),

	/** The else. */
	ELSE("ELSE"),

	/** The outer. */
	OUTER("OUTER"),

	/** The view. */
	VIEW("VIEW"),

	/** The end. */
	END("END"),

	/** The over. */
	OVER("OVER"),

	/** The waitfor. */
	WAITFOR("WAITFOR"),

	/** The errlvl. */
	ERRLVL("ERRLVL"),

	/** The percent. */
	PERCENT("PERCENT"),

	/** The when. */
	WHEN("WHEN"),

	/** The escape. */
	ESCAPE("ESCAPE"),

	/** The pivot. */
	PIVOT("PIVOT"),

	/** The where. */
	WHERE("WHERE"),

	/** The except. */
	EXCEPT("EXCEPT"),

	/** The plan. */
	PLAN("PLAN"),

	/** The while. */
	WHILE("WHILE"),

	/** The exec. */
	EXEC("EXEC"),

	/** The precision. */
	PRECISION("PRECISION"),

	/** The with. */
	WITH("WITH"),

	/** The execute. */
	EXECUTE("EXECUTE"),

	/** The primary. */
	PRIMARY("PRIMARY"),

	/** The within group. */
	WITHIN_GROUP("WITHIN GROUP"),

	/** The exists. */
	EXISTS("EXISTS"),

	/** The print. */
	PRINT("PRINT"),

	/** The writetext. */
	WRITETEXT("WRITETEXT"),

	/** The exit. */
	EXIT("EXIT"),

	/** The proc. */
	PROC("PROC"),

	/** The star. */
	STAR("*"),

	/** The group by. */
	GROUP_BY("GROUP BY");
	
	/** The key word. */
	private final String keyWord;

	/**
	 * Instantiates a new SQL key word.
	 *
	 * @param keyWord
	 *            the key word
	 */
	private KeyWord(final String keyWord) {
		this.keyWord = keyWord;
	}

	/**
	 * Gets the keyword.
	 *
	 * @return the string
	 */
	public String get() {
		return this.keyWord;
	}
}
