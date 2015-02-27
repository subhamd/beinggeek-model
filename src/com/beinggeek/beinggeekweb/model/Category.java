package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the CATEGORY database table.
 * 
 */
@Entity
@Table(name="CATEGORY")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(precision=1)
	private BigDecimal enabled;

	@Column(nullable=false, length=1020)
	private String name;

	@Column(name="OWNER_USER_TYPE", length=1020)
	private String ownerUserType;

	//bi-directional many-to-one association to User
    @ManyToOne
	@JoinColumn(name="OWNER_USER_ID")
	private User user;

	//bi-directional many-to-one association to CategoryItem
	@OneToMany(mappedBy="category")
	private Set<CategoryItem> categoryItems;

	//bi-directional many-to-one association to CategoryThumbnail
	@OneToMany(mappedBy="category")
	private Set<CategoryThumbnail> categoryThumbnails;

	//bi-directional many-to-one association to NavigationItemCategory
	@OneToMany(mappedBy="category")
	private Set<NavigationItemCategory> navigationItemCategories;

    public Category() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getEnabled() {
		return this.enabled;
	}

	public void setEnabled(BigDecimal enabled) {
		this.enabled = enabled;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerUserType() {
		return this.ownerUserType;
	}

	public void setOwnerUserType(String ownerUserType) {
		this.ownerUserType = ownerUserType;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Set<CategoryItem> getCategoryItems() {
		return this.categoryItems;
	}

	public void setCategoryItems(Set<CategoryItem> categoryItems) {
		this.categoryItems = categoryItems;
	}
	
	public Set<CategoryThumbnail> getCategoryThumbnails() {
		return this.categoryThumbnails;
	}

	public void setCategoryThumbnails(Set<CategoryThumbnail> categoryThumbnails) {
		this.categoryThumbnails = categoryThumbnails;
	}
	
	public Set<NavigationItemCategory> getNavigationItemCategories() {
		return this.navigationItemCategories;
	}

	public void setNavigationItemCategories(Set<NavigationItemCategory> navigationItemCategories) {
		this.navigationItemCategories = navigationItemCategories;
	}
	
}