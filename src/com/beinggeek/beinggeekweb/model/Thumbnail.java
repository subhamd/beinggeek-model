package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the THUMBNAIL database table.
 * 
 */
@Entity
@Table(name="THUMBNAIL")
public class Thumbnail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

    @Lob()
	@Column(name="THUMBNAIL_IMAGE")
	private byte[] thumbnailImage;

	@Column(name="THUMBNAIL_URL", length=1020)
	private String thumbnailUrl;

	//bi-directional many-to-one association to CategoryThumbnail
	@OneToMany(mappedBy="thumbnail")
	private Set<CategoryThumbnail> categoryThumbnails;

	//bi-directional many-to-one association to Item
	@OneToMany(mappedBy="thumbnail")
	private Set<Item> items;

	//bi-directional many-to-one association to ItemThumbnail
	@OneToMany(mappedBy="thumbnail")
	private Set<ItemThumbnail> itemThumbnails;

    public Thumbnail() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public byte[] getThumbnailImage() {
		return this.thumbnailImage;
	}

	public void setThumbnailImage(byte[] thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public String getThumbnailUrl() {
		return this.thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public Set<CategoryThumbnail> getCategoryThumbnails() {
		return this.categoryThumbnails;
	}

	public void setCategoryThumbnails(Set<CategoryThumbnail> categoryThumbnails) {
		this.categoryThumbnails = categoryThumbnails;
	}
	
	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
	public Set<ItemThumbnail> getItemThumbnails() {
		return this.itemThumbnails;
	}

	public void setItemThumbnails(Set<ItemThumbnail> itemThumbnails) {
		this.itemThumbnails = itemThumbnails;
	}
	
}