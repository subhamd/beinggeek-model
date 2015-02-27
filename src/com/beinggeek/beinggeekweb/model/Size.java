package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the SIZE_ database table.
 * 
 */
@Entity
@Table(name="SIZE_")
public class Size implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(name="SIZE_DESCRIPTION", nullable=false, length=1020)
	private String sizeDescription;

	//bi-directional many-to-many association to Item
    @ManyToMany
	@JoinTable(
		name="ITEM_SIZE"
		, joinColumns={
			@JoinColumn(name="SIZE_ID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ITEM_ID", nullable=false)
			}
		)
	private Set<Item> items;

    public Size() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSizeDescription() {
		return this.sizeDescription;
	}

	public void setSizeDescription(String sizeDescription) {
		this.sizeDescription = sizeDescription;
	}

	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
}