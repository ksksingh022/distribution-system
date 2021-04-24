package com.startup.distsystem.dto;

import java.io.Serializable;
import java.util.HashSet;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(value = {"id"}, allowGetters = true)
public class Retailer implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	@NotBlank(message="You must provide username")
	@Size(max=20, message = "username should not be greater than 20 character")
	private String username;
	
	@NotBlank(message = "please enter the password")
	private String password;
	
	@NotBlank(message = "please enter the email")
	@Email
	private String email;
	
	@NotBlank(message = "enter your contact number")
	private String contact;
	
	@NotBlank(message = "enter your address")
	@Size(max = 100)
	private String address;
	
	@NotBlank(message = "choose the city")
	private int cityId;
	
	@NotBlank(message = "choose the state")
	private int stateId;
	
	@NotBlank(message = "choose the country")
	private int countryId;
	
	@NotBlank(message = "A Retailer must choose a Distributor")
	private String mappedDistributorId;
	
	private HashSet<String> products;
	
	

	public Retailer(
			@NotBlank(message = "You must provide username") @Size(max = 20, message = "username should not be greater than 20 character") String username,
			@NotBlank(message = "please enter the password") String password,
			@NotBlank(message = "please enter the email") @Email String email,
			@NotBlank(message = "enter your contact number") String contact,
			@NotBlank(message = "enter your address") @Size(max = 100) String address,
			@NotBlank(message = "choose the city") int cityId, @NotBlank(message = "choose the state") int stateId,
			@NotBlank(message = "choose the country") int countryId,
			@NotBlank(message = "A Retailer must choose a Distributor")String mappedDistributorId) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.cityId = cityId;
		this.stateId = stateId;
		this.countryId = countryId;
		this.mappedDistributorId = mappedDistributorId;
		this.products = new HashSet<String>();
	}
	
}
