package org.sih.country;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class SimpleCountryDaoTest {

	@Autowired
	private CountryDao dao;
	private static final Country GB = new Country("GB","United Kingdom","Hello");
	
	@Before
	public void setUp() {
	}

	@Test
	public void shouldReturnCountryWhenCodeMatches() {
		Country c = dao.get("GB");
		assertNotNull(c);
		assertEquals(GB,c);
	}
	
	@Test
	public void shouldReturnNullWhenNoCodeMatch() {
		Country c = dao.get("11");
		assertNull(c);
	}
	
}
