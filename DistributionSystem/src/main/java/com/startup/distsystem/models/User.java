package com.startup.distsystem.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table (name="users")
@EntityListeners(AuditingEntityListener.class)
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false, unique = true)
	private String contact;
	
	@Column(nullable = false, unique = true)
	private String address;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private Role roleId;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private City cityId;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private State stateId;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Country countryId;
	
	@Column
	private int productCount;
	
	@Column
	private int totalProductSold;
	
	@Column
	private long totalSales;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Distributor distributor;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Retailer retailer;
	
	
	
}
