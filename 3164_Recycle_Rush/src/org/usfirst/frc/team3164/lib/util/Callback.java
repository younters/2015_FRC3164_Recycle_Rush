package org.usfirst.frc.team3164.lib.util;

/**
 * Callback class to be extended
 * @author jaxon
 *
 */
public abstract class Callback {
	/**
	 * Stores arguments that can be referenced from the call.
	 */
	public Object[] args;
	
	/**
	 * Instantiates a new Callback without arguments.
	 */
	public Callback() {
		args = new Object[0];
	}
	
	/**
	 * Instantiates a new callback with arguments.
	 * @param args List arguments that can be accessed from call().
	 */
	public Callback(Object... args) {
		this.args = args;
	}
}
