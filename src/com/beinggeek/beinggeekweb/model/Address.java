package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the ADDRESS database table.
 * 
 */
@Entity
@Table(name="ADDRESS")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(name="ADDRESS_1", nullable=false, length=1020)
	private String address1;

	@Column(name="ADDRESS_2", length=1020)
	private String address2;

	@Column(nullable=false, length=1020)
	private String city;

	@Column(nullable=false, length=1020)
	private String district;

	@Column(nullable=false, precision=6)
	private BigDecimal pin;

	@Column(name="\"STATE\"", nullable=false, length=1020)
	private String state;

	//bi-directional many-to-one association to UserAddress
	@OneToMany(mappedBy="address")
	private Set<UserAddress> userAddresses;

    public Address() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public BigDecimal getPin() {
		return this.pin;
	}

	public void setPin(BigDecimal pin) {
		this.pin = pin;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Set<UserAddress> getUserAddresses() {
		return this.userAddresses;
	}

	public void setUserAddresses(Set<UserAddress> userAddresses) {
		this.userAddresses = userAddresses;
	}
	
}