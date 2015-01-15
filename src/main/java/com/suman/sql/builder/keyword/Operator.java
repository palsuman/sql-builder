package com.suman.sql.builder.keyword;

/**
 * The Enum Operator.
 */
public enum Operator {

	/** The addition. */
	ADDITION("+"),

	/** The subtraction. */
	SUBTRACTION("-"),

	/** The multiplication. */
	MULTIPLICATION("*"),

	/** The division. */
	DIVISION("/"),

	/** The modulus. */
	MODULUS("%"),

	/** The eq. */
	EQ("="),

	/** The nq. */
	NQ("<>"),

	/** The gt. */
	GT(">"),

	/** The lt. */
	LT("<"),

	/** The ge. */
	GE(">="),

	/** The le. */
	LE("<="),

	/** The nlt. */
	NLT("!<"),

	/** The ngt. */
	NGT("!>"),
	
	/** The all. */
	ALL("ALL"),
	
	/** The and. */
	AND("AND"),
	
	/** The any. */
	ANY("ANY"),
	
	/** The between. */
	BETWEEN("BETWEEN"),
	
	/** The exists. */
	EXISTS("EXISTS"),
	
	/** The in. */
	IN("IN"),
	
	/** The like. */
	LIKE("LIKE"),
	
	/** The not. */
	NOT("NOT"),
	
	/** The or. */
	OR("OR"),
	
	/** The is null. */
	IS_NULL("IS NULL"),
	
	/** The unique. */
	UNIQUE("UNIQUE");
	
	/** The operator. */
	private final String operator;

	/**
	 * Instantiates a new operator.
	 *
	 * @param operator
	 *            the operator
	 */
	private Operator(final String operator) {
		this.operator = operator;
	}

	/**
	 * Gets the operator.
	 *
	 * @return the string
	 */
	public String get() {
		return this.operator;
	}
}
