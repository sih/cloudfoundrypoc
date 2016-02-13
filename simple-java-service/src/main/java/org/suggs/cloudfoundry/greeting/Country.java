package org.suggs.cloudfoundry.greeting;

/**
 * Represent a country from the ISO-3166 domain
 * @author sid
 */
public class Country {
	
	private String code;
	private String description;
	private String salutation;
	
	public Country(String code, String description, String salutation) {
		this.code = code;
		this.description = description;
		this.salutation = salutation;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

	
	
	
}
