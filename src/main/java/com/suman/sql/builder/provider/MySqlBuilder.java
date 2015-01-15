package com.suman.sql.builder.provider;

import java.sql.Timestamp;
import java.util.Date;

import com.suman.sql.builder.CommonSqlBuilder;
import com.suman.sql.builder.SqlBuilder;
import com.suman.sql.builder.datatype.DataType;
import com.suman.sql.builder.keyword.Symbol;

/**
 * The Class MySqlBuilder.
 */
class MySqlBuilder extends CommonSqlBuilder {

	/**
	 * Value.
	 *
	 * @param value
	 *            the value
	 * @param type
	 *            the data type
	 * @return the SQL builder
	 * @see com.suman.sql.builder.SqlBuilder#value(java.lang.Object,
	 *      com.suman.sql.builder.datatype.DataType)
	 */
	public SqlBuilder value(Object value, DataType type) {
		MySqlDataType mySqlDataType = (MySqlDataType) type;
		switch (mySqlDataType.get()) {
		case "INT":
			this.query.append((Integer) value);
			break;
		case "BOOLEAN":
			Boolean booleanValue = (Boolean) value;
			this.query.append(booleanValue ? 1 : 0);
			break;
		case "DOUBLE":
			this.query.append((Double) value);
			break;
		case "LONG":
			this.query.append((Long) value);
			break;
		case "DATE":
			Date date = (Date) value;
			this.symbol(Symbol.SINGLE_QUOTE).custom(getDate(date)).symbol(Symbol.SINGLE_QUOTE);
			break;
		case "DATETIME":
		case "TIMESTAMP":
			Timestamp timestamp = (Timestamp) value;
			this.symbol(Symbol.SINGLE_QUOTE).custom(getTimestamp(timestamp)).symbol(Symbol.SINGLE_QUOTE);
			break;
		case "VARCHAR":
		case "TEXT":
		default:
			this.symbol(Symbol.SINGLE_QUOTE).custom((String) value).symbol(Symbol.SINGLE_QUOTE);
		}

		return this;
	}

}
