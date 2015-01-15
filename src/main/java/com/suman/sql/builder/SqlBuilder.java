package com.suman.sql.builder;

import com.suman.sql.builder.datatype.DataType;
import com.suman.sql.builder.keyword.Aggregate;
import com.suman.sql.builder.keyword.Operator;
import com.suman.sql.builder.keyword.Separator;
import com.suman.sql.builder.keyword.KeyWord;
import com.suman.sql.builder.keyword.Symbol;
import com.suman.sql.builder.keyword.Wildcard;

/**
 * The Interface of SQL Query Builder.
 */
public interface SqlBuilder {
	
	/**
	 * Key word.
	 *
	 * @param keyWord the key word
	 * @return the SQL builder
	 */
	public SqlBuilder keyWord(KeyWord keyWord);
	
	/**
	 * Field.
	 *
	 * @param field the field
	 * @return the SQL builder
	 */
	public SqlBuilder field(String field);
	
	/**
	 * Aggregate.
	 *
	 * @param aggregate the aggregate
	 * @return the SQL builder
	 */
	public SqlBuilder aggregate(Aggregate aggregate);
	
	/**
	 * Operator.
	 *
	 * @param operator the operator
	 * @return the sql builder
	 */
	public SqlBuilder operator(Operator operator);
	
	/**
	 * Symbol.
	 *
	 * @param symbol the symbol
	 * @return the SQL builder
	 */
	public SqlBuilder symbol(Symbol symbol);
	
	/**
	 * Wildcard.
	 *
	 * @param wildcard the wildcard
	 * @return the sql builder
	 */
	public SqlBuilder wildcard(Wildcard wildcard);
	
	/**
	 * Data type.
	 *
	 * @param dataType the data type
	 * @return the sql builder
	 */
	public SqlBuilder dataType(DataType dataType);
	
	/**
	 * Custom.
	 *
	 * @param custom the custom
	 * @return the SQL builder
	 */
	public SqlBuilder custom(String custom);
	
	/**
	 * Custom.
	 *
	 * @param separator the separator
	 * @return the SQL builder
	 */
	public SqlBuilder separator(Separator separator);
	/**
	 * Value.
	 *
	 * @param value the value
	 * @param dataType data the type
	 * @return the SQL builder
	 */
	public SqlBuilder value(Object value, DataType type);
	
	
	/**
	 * Builds the SQL query.
	 *
	 * @return the string
	 */
	public String build();
	
}
