package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the NAVIGATION_ITEM_CATEGORY database table.
 * 
 */
@Embeddable
public class NavigationItemCategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="NAVIGATION_ITEM_ID", unique=true, nullable=false, precision=19)
	private long navigationItemId;

	@Column(name="CATEGORY_ID", unique=true, nullable=false, precision=19)
	private long categoryId;

	@Column(name="LIST_ORDER", unique=true, nullable=false, precision=10)
	private long listOrder;

    public NavigationItemCategoryPK() {
    }
	public long getNavigationItemId() {
		return this.navigationItemId;
	}
	public void setNavigationItemId(long navigationItemId) {
		this.navigationItemId = navigationItemId;
	}
	public long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
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
		if (!(other instanceof NavigationItemCategoryPK)) {
			return false;
		}
		NavigationItemCategoryPK castOther = (NavigationItemCategoryPK)other;
		return 
			(this.navigationItemId == castOther.navigationItemId)
			&& (this.categoryId == castOther.categoryId)
			&& (this.listOrder == castOther.listOrder);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.navigationItemId ^ (this.navigationItemId >>> 32)));
		hash = hash * prime + ((int) (this.categoryId ^ (this.categoryId >>> 32)));
		hash = hash * prime + ((int) (this.listOrder ^ (this.listOrder >>> 32)));
		
		return hash;
    }
}