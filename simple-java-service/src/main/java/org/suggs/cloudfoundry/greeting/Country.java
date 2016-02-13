package org.suggs.cloudfoundry.greeting;

/**
 * Represent a country from the ISO-3166 domain
 * @author sid
 */
public class Country {
	
	private String code;
	private String description;
	private String salutation;
	
	public Country() {
		
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
	public String getSalutation() {
		return salutation;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}


	
}
