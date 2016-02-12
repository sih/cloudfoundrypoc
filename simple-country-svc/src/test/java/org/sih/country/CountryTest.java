package org.sih.country;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class CountryTest {
	
	private Country c;
	private Country gb;
	private static final String GB_CODE = "GB";
	private static final String UK_CODE = "UK";
	private static final String UNITED_KINGDOM = "United Kingdom";
	private static final String GREAT_BRITAIN = "Great Britain";
	private static final String HELLO = "Hello";
	
	@Before
	public void setUp() {
		gb = new Country(GB_CODE,UNITED_KINGDOM,HELLO);
	}

	@Test
	public void shouldBeEqualIfCodeAndDescMatch() {
		c = new Country(GB_CODE,UNITED_KINGDOM,HELLO);
		assertEquals(gb,c);
	}
	
	@Test
	public void shouldNotBeEqualIfCodeDifferent() {
		c = new Country(UK_CODE,UNITED_KINGDOM,HELLO);
		assertNotEquals(gb,c);		
	}
	
	@Test
	public void shouldNotBeEqualIfDescDifferent() {
		c = new Country(GB_CODE,GREAT_BRITAIN,HELLO);
		assertNotEquals(gb,c);			
	}
	
}
