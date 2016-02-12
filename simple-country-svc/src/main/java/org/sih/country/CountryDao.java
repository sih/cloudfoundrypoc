package org.sih.country;

/**
 * This is a data service for the country domain. 
 * @author sid
 */
public interface CountryDao {
	
	/**
	 * @param code The ISO-3166 two-letter country code
	 * @return A Country object matching that code
	 */
	public Country get(String code); 
}
