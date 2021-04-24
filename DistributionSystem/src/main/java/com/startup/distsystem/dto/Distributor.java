package com.startup.distsystem.dto;

import java.io.Serializable;
import java.util.HashSet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(value = {"id", "productCount","totalProductsSold","totalSales","retailerCounts"}, allowGetters = true)
public class Distributor implements Serializable{

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
	
	private int productCount;
	private int totalProductsSold;
	private int totalSales;
	private int retailerCounts;
	
	private HashSet<String> mappedRetailers;
	private HashSet<String> products;
	
	public Distributor(
			@NotBlank(message = "You must provide username") @Size(max = 20, message = "username should not be greater than 20 character") String username,
			@NotBlank(message = "please enter the password") String password,
			@NotBlank(message = "please enter the email") @Email String email,
			@NotBlank(message = "enter your contact number") String contact,
			@NotBlank(message = "enter your address") @Size(max = 100) String address,
			@NotBlank(message = "choose the city") int cityId, @NotBlank(message = "choose the state") int stateId,
			@NotBlank(message = "choose the country") int countryId) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.cityId = cityId;
		this.stateId = stateId;
		this.countryId = countryId;
		this.mappedRetailers = new HashSet<String>();
		this.products = new HashSet<String>();
	}

	@Override
	public String toString() {
		return "Distributor [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", contact=" + contact + ", address=" + address + ", cityId=" + cityId + ", stateId=" + stateId
				+ ", countryId=" + countryId + ", productCount=" + productCount + ", totalProductsSold="
				+ totalProductsSold + ", totalSales=" + totalSales + ", retailerCounts=" + retailerCounts
				+ ", mappedRetailers=" + mappedRetailers + ", products=" + products + "]";
	}

}
