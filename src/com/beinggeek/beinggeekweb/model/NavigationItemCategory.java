package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the NAVIGATION_ITEM_CATEGORY database table.
 * 
 */
@Entity
@Table(name="NAVIGATION_ITEM_CATEGORY")
public class NavigationItemCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private NavigationItemCategoryPK id;

	//bi-directional many-to-one association to Category
    @ManyToOne
	@JoinColumn(name="CATEGORY_ID", nullable=false, insertable=false, updatable=false)
	private Category category;

	//bi-directional many-to-one association to NavigationItem
    @ManyToOne
	@JoinColumn(name="NAVIGATION_ITEM_ID", nullable=false, insertable=false, updatable=false)
	private NavigationItem navigationItem;

    public NavigationItemCategory() {
    }

	public NavigationItemCategoryPK getId() {
		return this.id;
	}

	public void setId(NavigationItemCategoryPK id) {
		this.id = id;
	}
	
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public NavigationItem getNavigationItem() {
		return this.navigationItem;
	}

	public void setNavigationItem(NavigationItem navigationItem) {
		this.navigationItem = navigationItem;
	}
	
}