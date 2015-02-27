package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CATEGORY_ITEM database table.
 * 
 */
@Entity
@Table(name="CATEGORY_ITEM")
public class CategoryItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CategoryItemPK id;

	//bi-directional many-to-one association to Category
    @ManyToOne
	@JoinColumn(name="CATEGORY_ID", nullable=false, insertable=false, updatable=false)
	private Category category;

	//bi-directional many-to-one association to Item
    @ManyToOne
	@JoinColumn(name="ITEM_ID", nullable=false, insertable=false, updatable=false)
	private Item item;

    public CategoryItem() {
    }

	public CategoryItemPK getId() {
		return this.id;
	}

	public void setId(CategoryItemPK id) {
		this.id = id;
	}
	
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
}