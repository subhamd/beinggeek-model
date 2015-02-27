package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the USER_ADDRESS database table.
 * 
 */
@Embeddable
public class UserAddressPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="USER_ID", unique=true, nullable=false, precision=19)
	private long userId;

	@Column(name="ADDRESS_ID", unique=true, nullable=false, precision=19)
	private long addressId;

	@Column(name="LIST_ORDER", unique=true, nullable=false, precision=10)
	private long listOrder;

    public UserAddressPK() {
    }
	public long getUserId() {
		return this.userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getAddressId() {
		return this.addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public long getListOrder() {
		return this.listOrder;
	}
	public void setListOrder(long listOrder) {
		this.listOrder = listOrder;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserAddressPK)) {
			return false;
		}
		UserAddressPK castOther = (UserAddressPK)other;
		return 
			(this.userId == castOther.userId)
			&& (this.addressId == castOther.addressId)
			&& (this.listOrder == castOther.listOrder);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.userId ^ (this.userId >>> 32)));
		hash = hash * prime + ((int) (this.addressId ^ (this.addressId >>> 32)));
		hash = hash * prime + ((int) (this.listOrder ^ (this.listOrder >>> 32)));
		
		return hash;
    }
}