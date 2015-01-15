package com.suman.sql.builder.provider;

import com.suman.sql.builder.datatype.DataType;

/**
 * The Class MySqlDataType.
 */
public class MySqlDataType implements DataType{
	
	/** The int. */
	public static final DataType INT = new MySqlDataType("INT");
	
	/** The Constant VARCHAR. */
	public static final DataType VARCHAR = new MySqlDataType("VARCHAR");
	
	/** The Constant TEXT. */
	public static final DataType TEXT = new MySqlDataType("TEXT");
	
	/** The Constant BOOLEAN. */
	public static final DataType BOOLEAN = new MySqlDataType("BOOLEAN");
	
	/** The Constant LONG. */
	public static final DataType LONG = new MySqlDataType("LONG");
	
	/** The Constant DOUBLE. */
	public static final DataType DOUBLE = new MySqlDataType("DOUBLE");
	
	/** The Constant DATE. */
	public static final DataType DATE = new MySqlDataType("DATE");
	
	/** The Constant TIMESTAMP. */
	public static final DataType TIMESTAMP = new MySqlDataType("TIMESTAMP");
	
	/** The Constant DATE_TIME. */
	public static final DataType DATE_TIME = new MySqlDataType("DATETIME");
	
	/** The type. */
	private final String type;
	
	/**
	 * Instantiates a new MySQL data type.
	 *
	 * @param type the type
	 */
	private MySqlDataType(String type) {
		this.type = type;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the string
	 * @see com.suman.sql.builder.datatype.DataType#get()
	 */
	public String get() {
		return this.type;
	}

}
