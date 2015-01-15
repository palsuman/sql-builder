package com.suman.sql.builder.keyword;

/**
 * The Enum Aggregate.
 */
public enum Aggregate {

	/** The avg. */
	AVG("AVG"),

	/** The min. */
	MIN("MIN"),

	/** The checksum agg. */
	CHECKSUM_AGG("CHECKSUM_AGG"),

	/** The sum. */
	SUM("SUM"),

	/** The count. */
	COUNT("COUNT"),

	/** The stdev. */
	STDEV("STDEV"),

	/** The count big. */
	COUNT_BIG("COUNT_BIG"),

	/** The stdevp. */
	STDEVP("STDEVP"),

	/** The grouping. */
	GROUPING("GROUPING"),

	/** The var. */
	VAR("VAR"),

	/** The grouping id. */
	GROUPING_ID("GROUPING_ID"),

	/** The varp. */
	VARP("VARP"),

	/** The max. */
	MAX("MAX");

	/** The aggregate. */
	private final String aggregate;

	/**
	 * Instantiates a new aggregate.
	 *
	 * @param aggregate
	 *            the aggregate
	 */
	private Aggregate(final String aggregate) {
		this.aggregate = aggregate;
	}

	/**
	 * Gets the aggregate.
	 *
	 * @return the string
	 */
	public String get() {
		return this.aggregate;
	}
}
