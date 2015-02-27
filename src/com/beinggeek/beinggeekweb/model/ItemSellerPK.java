package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ITEM_SELLER database table.
 * 
 */
@Embeddable
public class ItemSellerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ITEM_ID", unique=true, nullable=false, precision=19)
	private long itemId;

	@Column(name="SELLER_ID", unique=true, nullable=false, precision=19)
	private long sellerId;

    public ItemSellerPK() {
    }
	public long getItemId() {
		return this.itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ItemSellerPK)) {
			return false;
		}
		ItemSellerPK castOther = (ItemSellerPK)other;
		return 
			(this.itemId == castOther.itemId)
			&& (this.sellerId == castOther.sellerId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.itemId ^ (this.itemId >>> 32)));
		hash = hash * prime + ((int) (this.sellerId ^ (this.sellerId >>> 32)));
		
		return hash;
    }
}