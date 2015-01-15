package com.suman.sql.builder.config;

import com.suman.sql.builder.config.constant.Indent;
import com.suman.sql.builder.config.constant.VendorType;

/**
 * The Class SqlConfig.
 */
public class SqlConfig {

	/** The vendor type. */
	private static VendorType vendorType;

	/** The indent. */
	private static Indent indent;

	static {
		setDefault();
	}
	
	/**
	 * Instantiates a new sql config.
	 */
	private SqlConfig() {
		super();
	}
	/**
	 * Gets the vendor type.
	 *
	 * @return the vendorType
	 */
	public static VendorType getVendorType() {
		return vendorType;
	}

	/**
	 * Sets the vendor type.
	 *
	 * @param vendorType
	 *            the vendorType to set
	 */
	public static void setVendorType(VendorType vendorType) {
		SqlConfig.vendorType = vendorType;
	}

	/**
	 * Gets the indent.
	 *
	 * @return the indent
	 */
	public static Indent getIndent() {
		return indent;
	}

	/**
	 * Sets the indent.
	 *
	 * @param indent
	 *            the indent to set
	 */
	public static void setIndent(Indent indent) {
		SqlConfig.indent = indent;
	}

	/**
	 * Set the default configuration.
	 */
	public static void setDefault() {
		indent = Indent.FALSE;
		vendorType = VendorType.MYSQL;
	}
}
