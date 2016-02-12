package org.sih.country;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * This is a simple, in-memory implementation of a Country Data Service.
 * @author sid
 */
@Service
public class SimpleCountryDao implements CountryDao {
	
	private static final Map<String,Country> repo;
	static {
		repo = new HashMap<String,Country>();
		repo.put("GB", new Country("GB","United Kingdom"));
		repo.put("FR", new Country("FR","France"));
		repo.put("ES", new Country("ES","Spain"));
	}

	@Override
	public Country get(String code) {
		return repo.get(code);
	}

}
