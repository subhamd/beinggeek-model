package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the ITEM database table.
 * 
 */
@Entity
@Table(name="ITEM")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(nullable=false, length=4000)
	private String description;

	@Column(precision=1)
	private BigDecimal enabled;

	@Column(nullable=false, precision=19)
	private BigDecimal price;

	@Column(length=4000)
	private String specification;

	@Column(name="SUB_TITLE", length=1020)
	private String subTitle;

	@Column(nullable=false, length=1020)
	private String title;

	//bi-directional many-to-one association to CategoryItem
	@OneToMany(mappedBy="item")
	private Set<CategoryItem> categoryItems;

	//bi-directional many-to-many association to Color
    @ManyToMany
	@JoinTable(
		name="ITEM_COLOR"
		, joinColumns={
			@JoinColumn(name="ITEM_ID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="COLOR_ID", nullable=false)
			}
		)
	private Set<Color> colors;

	//bi-directional many-to-one association to Thumbnail
    @ManyToOne
	@JoinColumn(name="DEFAULT_THUMBNAIL_ID", nullable=false)
	private Thumbnail thumbnail;

	//bi-directional many-to-one association to ItemSeller
	@OneToMany(mappedBy="item")
	private Set<ItemSeller> itemSellers;

	//bi-directional many-to-one association to ItemThumbnail
	@OneToMany(mappedBy="item")
	private Set<ItemThumbnail> itemThumbnails;

	//bi-directional many-to-one association to Review
	@OneToMany(mappedBy="item")
	private Set<Review> reviews;

	//bi-directional many-to-many association to Size
	@ManyToMany(mappedBy="items")
	private Set<Size> sizes;

    public Item() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getEnabled() {
		return this.enabled;
	}

	public void setEnabled(BigDecimal enabled) {
		this.enabled = enabled;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getSpecification() {
		return this.specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getSubTitle() {
		return this.subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<CategoryItem> getCategoryItems() {
		return this.categoryItems;
	}

	public void setCategoryItems(Set<CategoryItem> categoryItems) {
		this.categoryItems = categoryItems;
	}
	
	public Set<Color> getColors() {
		return this.colors;
	}

	public void setColors(Set<Color> colors) {
		this.colors = colors;
	}
	
	public Thumbnail getThumbnail() {
		return this.thumbnail;
	}

	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}
	
	public Set<ItemSeller> getItemSellers() {
		return this.itemSellers;
	}

	public void setItemSellers(Set<ItemSeller> itemSellers) {
		this.itemSellers = itemSellers;
	}
	
	public Set<ItemThumbnail> getItemThumbnails() {
		return this.itemThumbnails;
	}

	public void setItemThumbnails(Set<ItemThumbnail> itemThumbnails) {
		this.itemThumbnails = itemThumbnails;
	}
	
	public Set<Review> getReviews() {
		return this.reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}
	
	public Set<Size> getSizes() {
		return this.sizes;
	}

	public void setSizes(Set<Size> sizes) {
		this.sizes = sizes;
	}
	
}