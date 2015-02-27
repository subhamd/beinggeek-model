package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CATEGORY_ITEM database table.
 * 
 */
@Embeddable
public class CategoryItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CATEGORY_ID", unique=true, nullable=false, precision=19)
	private long categoryId;

	@Column(name="ITEM_ID", unique=true, nullable=false, precision=19)
	private long itemId;

	@Column(name="LIST_ORDER", unique=true, nullable=false, precision=10)
	private long listOrder;

    public CategoryItemPK() {
    }
	public long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public long getItemId() {
		return this.itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
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
		if (!(other instanceof CategoryItemPK)) {
			return false;
		}
		CategoryItemPK castOther = (CategoryItemPK)other;
		return 
			(this.categoryId == castOther.categoryId)
			&& (this.itemId == castOther.itemId)
			&& (this.listOrder == castOther.listOrder);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.categoryId ^ (this.categoryId >>> 32)));
		hash = hash * prime + ((int) (this.itemId ^ (this.itemId >>> 32)));
		hash = hash * prime + ((int) (this.listOrder ^ (this.listOrder >>> 32)));
		
		return hash;
    }
}