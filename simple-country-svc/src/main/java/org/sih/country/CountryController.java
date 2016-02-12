package org.sih.country;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	// TODO be more spring
	private CountryDao dao = new SimpleCountryDao();
	
	@RequestMapping("/{code}")
	public Country get(@PathVariable (value="code") String code) {
		return dao.get(code);
	}

}
