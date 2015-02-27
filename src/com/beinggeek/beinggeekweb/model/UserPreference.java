package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USER_PREFERENCE database table.
 * 
 */
@Entity
@Table(name="USER_PREFERENCE")
public class UserPreference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(name="\"KEY\"", length=1020)
	private String key;

	@Column(name="\"VALUE\"", length=1020)
	private String value;

	//bi-directional many-to-one association to User
    @ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

    public UserPreference() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}