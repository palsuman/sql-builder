package com.suman.sql.builder;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.suman.sql.builder.datatype.DataType;
import com.suman.sql.builder.keyword.Aggregate;
import com.suman.sql.builder.keyword.Operator;
import com.suman.sql.builder.keyword.KeyWord;
import com.suman.sql.builder.keyword.Separator;
import com.suman.sql.builder.keyword.Symbol;
import com.suman.sql.builder.keyword.Wildcard;

/**
 * The Class CommonSqlBuilder.
 */
public abstract class CommonSqlBuilder implements SqlBuilder {

	/** The query. */
	protected StringBuilder query;

	/**
	 * Instantiates a new common sql builder.
	 */
	protected CommonSqlBuilder() {
		this.query = new StringBuilder();
	}

	/**
	 * Key word.
	 *
	 * @param keyWord
	 *            the key word
	 * @return the sql builder
	 * @see com.suman.sql.builder.SqlBuilder#keyWord(com.suman.sql.builder.keyword.KeyWord)
	 */
	public SqlBuilder keyWord(KeyWord keyWord) {
		this.query.append(keyWord.get());
		return this;
	}

	/**
	 * Field.
	 *
	 * @param field
	 *            the field
	 * @return the sql builder
	 * @see com.suman.sql.builder.SqlBuilder#field(java.lang.String)
	 */
	public SqlBuilder field(String field) {
		this.query.append(field);
		return this;
	}

	/**
	 * Aggregate.
	 *
	 * @param aggregate
	 *            the aggregate
	 * @return the sql builder
	 * @see com.suman.sql.builder.SqlBuilder#aggregate(com.suman.sql.builder.keyword.Aggregate)
	 */
	public SqlBuilder aggregate(Aggregate aggregate) {
		this.query.append(aggregate.get());
		return this;
	}

	/**
	 * Operator.
	 *
	 * @param operator
	 *            the operator
	 * @return the sql builder
	 * @see com.suman.sql.builder.SqlBuilder#operator(com.suman.sql.builder.keyword.Operator)
	 */
	public SqlBuilder operator(Operator operator) {
		this.query.append(operator.get());
		return this;
	}

	/**
	 * Symbol.
	 *
	 * @param symbol
	 *            the symbol
	 * @return the sql builder
	 * @see com.suman.sql.builder.SqlBuilder#symbol(com.suman.sql.builder.keyword.Symbol)
	 */
	public SqlBuilder symbol(Symbol symbol) {
		this.query.append(symbol.get());
		return this;
	}

	/**
	 * Symbol.
	 *
	 * @param wildcard
	 *            the wildcard
	 * @return the sql builder
	 * @see com.suman.sql.builder.SqlBuilder#symbol(com.suman.sql.builder.keyword.Wildcard)
	 */
	public SqlBuilder wildcard(Wildcard wildcard) {
		this.query.append(wildcard.get());
		return this;
	}

	/**
	 * Custom.
	 *
	 * @param custom
	 *            the custom
	 * @return the sql builder
	 * @see com.suman.sql.builder.SqlBuilder#custom(java.lang.String)
	 */
	public SqlBuilder custom(String custom) {
		this.query.append(custom);
		return this;
	}

	/**
	 * Data type.
	 *
	 * @param dataType
	 *            the data type
	 * @return the sql builder
	 * @see com.suman.sql.builder.SqlBuilder#dataType(com.suman.sql.builder.datatype.DataType)
	 */
	public SqlBuilder dataType(DataType dataType) {
		this.query.append(dataType.get());
		return this;
	}

	/**
	 * Separator.
	 *
	 * @param separator
	 *            the separator
	 * @return the sql builder
	 * @see com.suman.sql.builder.SqlBuilder#separator(com.suman.sql.builder.keyword.Separator)
	 */
	public SqlBuilder separator(Separator separator) {
		this.query.append(separator.get());
		return this;
	}

	/**
	 * Builds the SQl Query.
	 *
	 * @return the string
	 * @see com.suman.sql.builder.SqlBuilder#build()
	 */
	public String build() {
		return query.append(";").toString();
	}

	
	/**
	 * Gets the date.
	 *
	 * @param date the date
	 * @return the date
	 */
	protected String getDate(Date date) {
		return getFormatedDate(date, "yyyy-MM-dd");
	}
	
	/**
	 * Gets the timestamp.
	 *
	 * @param timestamp the timestamp
	 * @return the timestamp
	 */
	protected String getTimestamp(Timestamp timestamp) {
		Date date = new Date(timestamp.getTime());
		return getFormatedDate(date, "yyyy-MM-dd hh:mm:ss");
	}
	
	/**
	 * Gets the formated date.
	 *
	 * @param date the date
	 * @param pattern the pattern
	 * @return the formated date
	 */
	private String getFormatedDate(Date date, String pattern) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.format(date);
	}
}
