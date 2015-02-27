package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the COLOR database table.
 * 
 */
@Entity
@Table(name="COLOR")
public class Color implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(name="COLOR_DESCRIPTION", nullable=false, length=1020)
	private String colorDescription;

	//bi-directional many-to-many association to Item
	@ManyToMany(mappedBy="colors")
	private Set<Item> items;

    public Color() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColorDescription() {
		return this.colorDescription;
	}

	public void setColorDescription(String colorDescription) {
		this.colorDescription = colorDescription;
	}

	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
}