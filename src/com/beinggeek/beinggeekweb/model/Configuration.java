package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CONFIGURATION database table.
 * 
 */
@Entity
@Table(name="CONFIGURATION")
public class Configuration implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ConfigurationPK id;

	@Column(name="\"VALUE\"", length=1020)
	private String value;

    public Configuration() {
    }

	public ConfigurationPK getId() {
		return this.id;
	}

	public void setId(ConfigurationPK id) {
		this.id = id;
	}
	
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}