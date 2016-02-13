package org.sih.country;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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
		repo.put("GB", new Country("GB","United Kingdom","Hello"));
		repo.put("FR", new Country("FR","France","Bonjour"));
		repo.put("ES", new Country("ES","Spain","Hola"));
		repo.put("US", new Country("US","United States","Howdy"));
		repo.put("CH", new Country("CH","Switzerland","Grüezi"));
	}

	@Override
	public Country get(String code) {
		Country c = repo.get(code);
		return (c != null) ? c : repo.get("GB");
	}

}
