package org.example.repository;

import org.example.domain.*;
import org.springframework.data.neo4j.repository.*;

/**
 * @author mdurand
 *
 */
public interface AddressRepository extends GraphRepository<Address> {

}
