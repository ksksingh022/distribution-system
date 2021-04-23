package com.startup.distsystem.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "distributor")
@EntityListeners(AuditingEntityListener.class)
public class Distributor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String distributorId;
	
	@Column
	private int retailerCount;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private User distributorDetails;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Retailer> mappedRetailers;
}
