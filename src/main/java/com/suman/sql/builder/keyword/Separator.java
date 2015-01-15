package com.suman.sql.builder.keyword;

public enum Separator {
	SPACE(" "),
	COMMA(", ");
	
	/** The key word. */
	private final String separator;

	/**
	 * Instantiates a new SQL separator.
	 *
	 * @param separator
	 *            the separator
	 */
	private Separator(final String separator) {
		this.separator = separator;
	}

	/**
	 * Gets the separator.
	 *
	 * @return the string
	 */
	public String get() {
		return this.separator;
	}
}
