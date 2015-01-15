package com.suman.sql.builder.keyword;

// TODO: Auto-generated Javadoc
/**
 * The Enum Wildcard.
 */
public enum Wildcard {

	/** The zero or more characters. */
	ZERO_OR_MORE_CHARACTERS("%"),

	/** The single character. */
	SINGLE_CHARACTER("_");

	/** The wildcard. */
	private final String wildcard;

	/**
	 * Instantiates a new wildcard.
	 *
	 * @param wildcard
	 *            the wildcard
	 */
	private Wildcard(final String wildcard) {
		this.wildcard = wildcard;
	}

	/**
	 * Gets the wildcard.
	 *
	 * @return the string
	 */
	public String get() {
		return this.wildcard;
	}
}
