package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CATEGORY_THUMBNAIL database table.
 * 
 */
@Embeddable
public class CategoryThumbnailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CATEGORY_ID", unique=true, nullable=false, precision=19)
	private long categoryId;

	@Column(name="THUMBNAIL_ID", unique=true, nullable=false, precision=19)
	private long thumbnailId;

	@Column(name="LIST_ORDER", unique=true, nullable=false, precision=10)
	private long listOrder;

    public CategoryThumbnailPK() {
    }
	public long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public long getThumbnailId() {
		return this.thumbnailId;
	}
	public void setThumbnailId(long thumbnailId) {
		this.thumbnailId = thumbnailId;
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
		if (!(other instanceof CategoryThumbnailPK)) {
			return false;
		}
		CategoryThumbnailPK castOther = (CategoryThumbnailPK)other;
		return 
			(this.categoryId == castOther.categoryId)
			&& (this.thumbnailId == castOther.thumbnailId)
			&& (this.listOrder == castOther.listOrder);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.categoryId ^ (this.categoryId >>> 32)));
		hash = hash * prime + ((int) (this.thumbnailId ^ (this.thumbnailId >>> 32)));
		hash = hash * prime + ((int) (this.listOrder ^ (this.listOrder >>> 32)));
		
		return hash;
    }
}