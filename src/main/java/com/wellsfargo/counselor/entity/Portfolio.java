package com.wellsfargo.counselor.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Portfolio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Portfolio-ID")
	private int  portfolioID;
	
	@Column(name="Portfolio-Type", nullable=false)
	private String portfolioType;

	@Column(name="Portfolio-Created-on", nullable=false)
	private LocalDate creationDateate;
	
	@ManyToOne
	@JoinColumn(name="clientID")
	private Client client;
	
	@OneToMany(mappedBy = "portfolio")
	private List<Security> securities;

	public Portfolio(int portfolioID, String portfolioType, LocalDate creationDateate, Client client,
			List<Security> securities) {
		super();
		this.portfolioID = portfolioID;
		this.portfolioType = portfolioType;
		this.creationDateate = creationDateate;
		this.client = client;
		this.securities = securities;
	}

	public int getPortfolioID() {
		return portfolioID;
	}


	public String getPortfolioType() {
		return portfolioType;
	}

	public void setPortfolioType(String portfolioType) {
		this.portfolioType = portfolioType;
	}

	public LocalDate getCreationDateate() {
		return creationDateate;
	}

	public void setCreationDateate(LocalDate creationDateate) {
		this.creationDateate = creationDateate;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Security> getSecurities() {
		return securities;
	}

	public void setSecurities(List<Security> securities) {
		this.securities = securities;
	}
	
	
	
}
