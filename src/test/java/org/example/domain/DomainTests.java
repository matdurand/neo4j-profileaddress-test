package org.example.domain;

import org.example.repository.*;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.neo4j.support.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;
import org.springframework.transaction.annotation.*;
import static org.junit.Assert.*;

/**
 * @author mdurand
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/test-context.xml"})
@Transactional
public class DomainTests {
	@Autowired
	protected ProfileRepository profileRepository;

	@Autowired
	protected AddressRepository addressRepository;

	@Autowired
	protected Neo4jTemplate template;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createAndReload() {
    	Address primary = new Address();
    	primary.setCity("Quebec");
    	primary.setStreet("St-Paul");
    	primary = addressRepository.save(primary);

    	Profile profile = new Profile();
    	profile.setName("Mathieu");
    	profile.setAddress(primary);
    	profile = profileRepository.save(profile);

    	Profile retrivedProfile = profileRepository.findOne(profile.getId());
    	Address address = retrivedProfile.getAddress(template);
		assertEquals("Quebec", address.getCity());
    	assertEquals("St-Paul", address.getStreet());
    }
}
