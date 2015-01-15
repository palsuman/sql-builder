package com.suman.sql.builder.keyword;

/**
 * The Enum Symbol.
 */
public enum Symbol {

	/** The open bracket. */
	OPEN_BRACKET("("),

	/** The close bracket. */
	CLOSE_BRACKET(")"),

	/** The single quote. */
	SINGLE_QUOTE("'"),

	/** The double quote. */
	DOUBLE_QUOTE("\"");

	/** The symbol. */
	private final String symbol;

	/**
	 * Instantiates a new symbol.
	 *
	 * @param symbol
	 *            the symbol
	 */
	private Symbol(final String symbol) {
		this.symbol = symbol;
	}

	/**
	 * Gets the symbol.
	 *
	 * @return the string
	 */
	public String get() {
		return this.symbol;
	}
}
