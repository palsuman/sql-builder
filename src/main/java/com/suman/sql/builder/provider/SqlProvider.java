package com.suman.sql.builder.provider;

import com.suman.sql.builder.SqlBuilder;
import com.suman.sql.builder.config.SqlConfig;

public class SqlProvider {

	private SqlProvider() {
		super();
	}

	public static SqlBuilder createSqlBuilder() {
		SqlBuilder sqlBuilder = null;
		switch (SqlConfig.getVendorType()) {
		case MYSQL:
			sqlBuilder = new MySqlBuilder();
			break;
		default:
			break;

		}
		return sqlBuilder;
	}
}
