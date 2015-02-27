package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ITEM_SELLER database table.
 * 
 */
@Entity
@Table(name="ITEM_SELLER")
public class ItemSeller implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemSellerPK id;

	@Column(precision=10)
	private BigDecimal quantity;

	//bi-directional many-to-one association to Item
    @ManyToOne
	@JoinColumn(name="ITEM_ID", nullable=false, insertable=false, updatable=false)
	private Item item;

	//bi-directional many-to-one association to User
    @ManyToOne
	@JoinColumn(name="SELLER_ID", nullable=false, insertable=false, updatable=false)
	private User user;

    public ItemSeller() {
    }

	public ItemSellerPK getId() {
		return this.id;
	}

	public void setId(ItemSellerPK id) {
		this.id = id;
	}
	
	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}