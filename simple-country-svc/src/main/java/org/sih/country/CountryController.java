package org.sih.country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	Logger log = LoggerFactory.getLogger(CountryController.class);
	
	@Autowired
	private CountryDao dao;
	
	@RequestMapping("/country/{code}")
	public Country get(@PathVariable (value="code") String code) {
		log.info("Getting country with code "+code);
		return dao.get(code);
	}

}
