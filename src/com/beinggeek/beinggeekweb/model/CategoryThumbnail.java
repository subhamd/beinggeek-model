package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CATEGORY_THUMBNAIL database table.
 * 
 */
@Entity
@Table(name="CATEGORY_THUMBNAIL")
public class CategoryThumbnail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CategoryThumbnailPK id;

	//bi-directional many-to-one association to Category
    @ManyToOne
	@JoinColumn(name="CATEGORY_ID", nullable=false, insertable=false, updatable=false)
	private Category category;

	//bi-directional many-to-one association to Thumbnail
    @ManyToOne
	@JoinColumn(name="THUMBNAIL_ID", nullable=false, insertable=false, updatable=false)
	private Thumbnail thumbnail;

    public CategoryThumbnail() {
    }

	public CategoryThumbnailPK getId() {
		return this.id;
	}

	public void setId(CategoryThumbnailPK id) {
		this.id = id;
	}
	
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Thumbnail getThumbnail() {
		return this.thumbnail;
	}

	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}
	
}