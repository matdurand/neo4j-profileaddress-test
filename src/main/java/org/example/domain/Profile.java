package org.example.domain;

import org.springframework.data.neo4j.annotation.*;
import org.springframework.data.neo4j.support.*;

/**
 * @author mdurand
 *
 */
@NodeEntity
public class Profile
{
    @GraphId
    private Long id;
    private String name;
    @RelatedTo
    private Address address;
    private boolean addressLoaded = false;

    /**
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * @param a_id
     *            the id to set
     */
    public void setId(
            Long a_id)
    {
        id = a_id;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param a_name
     *            the name to set
     */
    public void setName(
            String a_name)
    {
        name = a_name;
    }

    /**
     * @return the address
     */
    public Address getAddress(
            Neo4jTemplate template)
    {
        if (!addressLoaded) {
            address = template.fetch(address);
            addressLoaded = true;
        }
        return address;
    }

    /**
     * @param a_address
     *            the address to set
     */
    public void setAddress(
            Address a_address)
    {
        address = a_address;
    }

}
