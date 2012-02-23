package org.example.domain;

import org.springframework.data.neo4j.annotation.*;

/**
 * @author mdurand
 *
 */
@NodeEntity
public class Profile {
	@GraphId
	private Long id;
	private String name;
	@RelatedTo
	private Address address;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param a_id
	 *            the id to set
	 */
	public void setId(Long a_id) {
		id = a_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param a_name
	 *            the name to set
	 */
	public void setName(String a_name) {
		name = a_name;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param a_address
	 *            the address to set
	 */
	public void setAddress(Address a_address) {
		address = a_address;
	}

}
