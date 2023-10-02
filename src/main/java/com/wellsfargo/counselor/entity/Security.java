package com.wellsfargo.counselor.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Security-ID")
	private long securityID;
	
	@Column(name="Security-Name", nullable=false)
	private String securityName;
	
	@Column(name="Security-Category", nullable=false)
	private  String category;
	
	@Column(name="Security-Purchase-Date", nullable=false)
	private LocalDate purchaseDate;
	
	@Column(name="Security-Purchase-Price", nullable=false)
	private int purchasePrice;
	
	@Column(name="Security-Quantity", nullable=false)
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="portfolioID")
	private Portfolio portfolios;

	public Security(long securityID, String securityName, String category, LocalDate purchaseDate, int purchasePrice,
			int quantity, Portfolio portfolios) {
		super();
		this.securityID = securityID;
		this.securityName = securityName;
		this.category = category;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		this.quantity = quantity;
		this.portfolios = portfolios;
	}

	public long getSecurityID() {
		return securityID;
	}

	public String getSecurityName() {
		return securityName;
	}

	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Portfolio getPortfolios() {
		return portfolios;
	}

	public void setPortfolios(Portfolio portfolios) {
		this.portfolios = portfolios;
	}
	
}
