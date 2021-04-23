package com.startup.distsystem.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "country")
@EntityListeners(AuditingEntityListener.class)
public class Country implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int countryId;
	
	@Column(nullable = false, unique = true)
	private String countryName;

}
