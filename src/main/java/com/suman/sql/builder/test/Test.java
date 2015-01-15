package com.suman.sql.builder.test;

import com.suman.sql.builder.SqlBuilder;
import com.suman.sql.builder.config.SqlConfig;
import com.suman.sql.builder.config.constant.Indent;
import com.suman.sql.builder.config.constant.VendorType;
import com.suman.sql.builder.keyword.KeyWord;
import com.suman.sql.builder.keyword.Operator;
import com.suman.sql.builder.keyword.Separator;
import com.suman.sql.builder.keyword.Symbol;
import com.suman.sql.builder.keyword.Wildcard;
import com.suman.sql.builder.provider.MySqlDataType;
import com.suman.sql.builder.provider.SqlProvider;

public class Test {
	public static void main(String[] args) {
		SqlConfig.setVendorType(VendorType.MYSQL);
		SqlConfig.setIndent(Indent.FALSE);
		SqlBuilder sqlBuilder = SqlProvider.createSqlBuilder();
		String query = sqlBuilder.keyWord(KeyWord.SELECT)
				.separator(Separator.SPACE)
				.keyWord(KeyWord.STAR)
				.separator(Separator.SPACE)
				.keyWord(KeyWord.FROM)
				.separator(Separator.SPACE)
				.custom("x_table")
				.separator(Separator.SPACE)
				.keyWord(KeyWord.WHERE)
				.separator(Separator.SPACE)
				.field("field1")
				.separator(Separator.SPACE)
				.operator(Operator.EQ)
				.separator(Separator.SPACE)
				.value(true, MySqlDataType.BOOLEAN)
				.separator(Separator.SPACE)
				.keyWord(KeyWord.AND)
				.separator(Separator.SPACE)
				.field("field2")
				.separator(Separator.SPACE)
				.operator(Operator.LIKE)
				.separator(Separator.SPACE)
				.symbol(Symbol.SINGLE_QUOTE)
				.wildcard(Wildcard.ZERO_OR_MORE_CHARACTERS)
				.custom("man")
				.symbol(Symbol.SINGLE_QUOTE)
				.build();
		System.out.println("Query: " + query);
	}
}
