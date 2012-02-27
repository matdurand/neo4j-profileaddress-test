package org.example.domain;

import org.springframework.data.neo4j.annotation.*;

/**
 * @author mdurand
 *
 */
@NodeEntity
public class Address
{
    @GraphId
    private Long id;
    private String street;
    private String city;

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
     * @return the street
     */
    public String getStreet()
    {
        return street;
    }

    /**
     * @param a_street
     *            the street to set
     */
    public void setStreet(
            String a_street)
    {
        street = a_street;
    }

    /**
     * @return the city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * @param a_city
     *            the city to set
     */
    public void setCity(
            String a_city)
    {
        city = a_city;
    }

}
