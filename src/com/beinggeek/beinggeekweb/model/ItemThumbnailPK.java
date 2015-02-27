package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ITEM_THUMBNAIL database table.
 * 
 */
@Embeddable
public class ItemThumbnailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ITEM_ID", unique=true, nullable=false, precision=19)
	private long itemId;

	@Column(name="THUMBNAIL_ID", unique=true, nullable=false, precision=19)
	private long thumbnailId;

	@Column(name="LIST_ORDER", unique=true, nullable=false, precision=10)
	private long listOrder;

    public ItemThumbnailPK() {
    }
	public long getItemId() {
		return this.itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
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
		if (!(other instanceof ItemThumbnailPK)) {
			return false;
		}
		ItemThumbnailPK castOther = (ItemThumbnailPK)other;
		return 
			(this.itemId == castOther.itemId)
			&& (this.thumbnailId == castOther.thumbnailId)
			&& (this.listOrder == castOther.listOrder);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.itemId ^ (this.itemId >>> 32)));
		hash = hash * prime + ((int) (this.thumbnailId ^ (this.thumbnailId >>> 32)));
		hash = hash * prime + ((int) (this.listOrder ^ (this.listOrder >>> 32)));
		
		return hash;
    }
}