package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USER_ADDRESS database table.
 * 
 */
@Entity
@Table(name="USER_ADDRESS")
public class UserAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserAddressPK id;

	@Column(length=1020)
	private String description;

	//bi-directional many-to-one association to Address
    @ManyToOne
	@JoinColumn(name="ADDRESS_ID", nullable=false, insertable=false, updatable=false)
	private Address address;

	//bi-directional many-to-one association to User
    @ManyToOne
	@JoinColumn(name="USER_ID", nullable=false, insertable=false, updatable=false)
	private User user;

    public UserAddress() {
    }

	public UserAddressPK getId() {
		return this.id;
	}

	public void setId(UserAddressPK id) {
		this.id = id;
	}
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}