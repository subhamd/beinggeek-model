package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the REVIEW database table.
 * 
 */
@Entity
@Table(name="REVIEW")
public class Review implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(nullable=false, precision=1)
	private BigDecimal rating;

	@Column(name="REV_BODY", nullable=false, length=1020)
	private String revBody;

	@Column(name="REV_HEADER", nullable=false, length=1020)
	private String revHeader;

	@Column(name="REV_HELPFUL_N_NO", precision=1)
	private BigDecimal revHelpfulNNo;

	@Column(name="REV_HELPFUL_Y_NO", precision=1)
	private BigDecimal revHelpfulYNo;

	//bi-directional many-to-one association to Item
    @ManyToOne
	@JoinColumn(name="ITEM_ID", nullable=false)
	private Item item;

	//bi-directional many-to-one association to User
    @ManyToOne
	@JoinColumn(name="REVIEWER_ID", nullable=false)
	private User user;

    public Review() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getRating() {
		return this.rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}

	public String getRevBody() {
		return this.revBody;
	}

	public void setRevBody(String revBody) {
		this.revBody = revBody;
	}

	public String getRevHeader() {
		return this.revHeader;
	}

	public void setRevHeader(String revHeader) {
		this.revHeader = revHeader;
	}

	public BigDecimal getRevHelpfulNNo() {
		return this.revHelpfulNNo;
	}

	public void setRevHelpfulNNo(BigDecimal revHelpfulNNo) {
		this.revHelpfulNNo = revHelpfulNNo;
	}

	public BigDecimal getRevHelpfulYNo() {
		return this.revHelpfulYNo;
	}

	public void setRevHelpfulYNo(BigDecimal revHelpfulYNo) {
		this.revHelpfulYNo = revHelpfulYNo;
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