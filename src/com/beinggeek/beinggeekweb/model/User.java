package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the USERS database table.
 * 
 */
@Entity
@Table(name="USERS")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(name="EMAIL_ID", nullable=false, length=1020)
	private String emailId;

	@Column(name="EMAIL_ID_VERIFIED", precision=1)
	private BigDecimal emailIdVerified;

	@Column(precision=1)
	private BigDecimal enabled;

	@Column(nullable=false, length=1020)
	private String name;

	@Column(nullable=false, length=1020)
	private String password;

	@Column(name="PRIMARY_CONTACT_NO", precision=10)
	private BigDecimal primaryContactNo;

	@Column(name="PRIMARY_CONTACT_VERIFIED", precision=1)
	private BigDecimal primaryContactVerified;

	@Column(name="SECONDARY_CONTACT_NO", precision=10)
	private BigDecimal secondaryContactNo;

	@Column(name="USER_TYPE", nullable=false, length=1020)
	private String userType;

	//bi-directional many-to-one association to Category
	@OneToMany(mappedBy="user")
	private Set<Category> categories;

	//bi-directional many-to-one association to ItemSeller
	@OneToMany(mappedBy="user")
	private Set<ItemSeller> itemSellers;

	//bi-directional many-to-one association to NavigationItem
	@OneToMany(mappedBy="user")
	private Set<NavigationItem> navigationItems;

	//bi-directional many-to-one association to Review
	@OneToMany(mappedBy="user")
	private Set<Review> reviews;

	//bi-directional many-to-one association to UserAddress
	@OneToMany(mappedBy="user")
	private Set<UserAddress> userAddresses;

	//bi-directional many-to-one association to UserPreference
	@OneToMany(mappedBy="user")
	private Set<UserPreference> userPreferences;

    public User() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public BigDecimal getEmailIdVerified() {
		return this.emailIdVerified;
	}

	public void setEmailIdVerified(BigDecimal emailIdVerified) {
		this.emailIdVerified = emailIdVerified;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getPrimaryContactNo() {
		return this.primaryContactNo;
	}

	public void setPrimaryContactNo(BigDecimal primaryContactNo) {
		this.primaryContactNo = primaryContactNo;
	}

	public BigDecimal getPrimaryContactVerified() {
		return this.primaryContactVerified;
	}

	public void setPrimaryContactVerified(BigDecimal primaryContactVerified) {
		this.primaryContactVerified = primaryContactVerified;
	}

	public BigDecimal getSecondaryContactNo() {
		return this.secondaryContactNo;
	}

	public void setSecondaryContactNo(BigDecimal secondaryContactNo) {
		this.secondaryContactNo = secondaryContactNo;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Set<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	public Set<ItemSeller> getItemSellers() {
		return this.itemSellers;
	}

	public void setItemSellers(Set<ItemSeller> itemSellers) {
		this.itemSellers = itemSellers;
	}
	
	public Set<NavigationItem> getNavigationItems() {
		return this.navigationItems;
	}

	public void setNavigationItems(Set<NavigationItem> navigationItems) {
		this.navigationItems = navigationItems;
	}
	
	public Set<Review> getReviews() {
		return this.reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}
	
	public Set<UserAddress> getUserAddresses() {
		return this.userAddresses;
	}

	public void setUserAddresses(Set<UserAddress> userAddresses) {
		this.userAddresses = userAddresses;
	}
	
	public Set<UserPreference> getUserPreferences() {
		return this.userPreferences;
	}

	public void setUserPreferences(Set<UserPreference> userPreferences) {
		this.userPreferences = userPreferences;
	}
	
}