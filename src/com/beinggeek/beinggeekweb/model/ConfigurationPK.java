package com.beinggeek.beinggeekweb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CONFIGURATION database table.
 * 
 */
@Embeddable
public class ConfigurationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=1020)
	private String name;

	@Column(name="\"KEY\"", unique=true, nullable=false, length=1020)
	private String key;

    public ConfigurationPK() {
    }
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ConfigurationPK)) {
			return false;
		}
		ConfigurationPK castOther = (ConfigurationPK)other;
		return 
			this.name.equals(castOther.name)
			&& this.key.equals(castOther.key);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.name.hashCode();
		hash = hash * prime + this.key.hashCode();
		
		return hash;
    }
}