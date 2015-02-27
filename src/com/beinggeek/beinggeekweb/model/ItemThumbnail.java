package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ITEM_THUMBNAIL database table.
 * 
 */
@Entity
@Table(name="ITEM_THUMBNAIL")
public class ItemThumbnail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemThumbnailPK id;

	//bi-directional many-to-one association to Item
    @ManyToOne
	@JoinColumn(name="ITEM_ID", nullable=false, insertable=false, updatable=false)
	private Item item;

	//bi-directional many-to-one association to Thumbnail
    @ManyToOne
	@JoinColumn(name="THUMBNAIL_ID", nullable=false, insertable=false, updatable=false)
	private Thumbnail thumbnail;

    public ItemThumbnail() {
    }

	public ItemThumbnailPK getId() {
		return this.id;
	}

	public void setId(ItemThumbnailPK id) {
		this.id = id;
	}
	
	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public Thumbnail getThumbnail() {
		return this.thumbnail;
	}

	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}
	
}