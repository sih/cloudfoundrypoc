package org.suggs.cloudfoundry.greeting;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;

@RestController
public class GreetingController {

	Logger log = LoggerFactory.getLogger(GreetingController.class);
	
	private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private RestTemplate restTemplate;

    // rest template will resolve the location 'magically'
    private String countryService = "simple-country-service/country";

    
    @RequestMapping("/")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
    @RequestMapping("/v2")
    public Greeting salutation(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value="country", defaultValue="GB") String country) {
    	return resolveGreeting(name,country);
    }
    
    private Greeting resolveGreeting(String name, String countryCode) {
    	Country c = restTemplate.getForObject(buildRestUrl(countryCode), Country.class);
    	String s = c.getSalutation()+", "+name;
    	
    	return new Greeting(counter.incrementAndGet(),s);
	}
    
    private String buildRestUrl(String countryCode) {
        return "http://" + countryService + "/" + countryCode;
    }

    
}
