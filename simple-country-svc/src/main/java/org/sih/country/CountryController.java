package org.sih.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	@Autowired
	private CountryDao dao;
	
	@RequestMapping("/country/{code}")
	public Country get(@PathVariable (value="code") String code) {
		return dao.get(code);
	}

}
