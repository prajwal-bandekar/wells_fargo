package com.wellsfargo.counselor.entity;

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
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Client-ID")
	private int clientID;

	@Column(name="Client-FirstName", nullable=false)
	private String cFirstName;
	
	@Column(name="Client-LastName", nullable=false)
	private String cLastName;

	@Column(name="Phone", nullable=false, unique=true)
	private long cPhone;

	@Column(name="Email", nullable=false, unique=true)
	private String cEmail;

	@Column(name="Password", nullable=false)
	private String cPassword;

	@ManyToOne
	@JoinColumn(name="advisorId")
	private Advisor advisor;

	@OneToMany(mappedBy = "client")
	private List<Portfolio> portfolios;

	public Client(String cFirstName, String cLastName, long cPhone, String cEmail, String cPassword, Advisor advisor,
			List<Portfolio> portfolios) {
		super();
		this.cFirstName = cFirstName;
		this.cLastName = cLastName;
		this.cPhone = cPhone;
		this.cEmail = cEmail;
		this.cPassword = cPassword;
		this.advisor = advisor;
		this.portfolios = portfolios;
	}

	public int getClientID() {
		return clientID;
	}


	public String getcFirstName() {
		return cFirstName;
	}

	public void setcFirstName(String cFirstName) {
		this.cFirstName = cFirstName;
	}

	public String getcLastName() {
		return cLastName;
	}

	public void setcLastName(String cLastName) {
		this.cLastName = cLastName;
	}

	public long getcPhone() {
		return cPhone;
	}

	public void setcPhone(long cPhone) {
		this.cPhone = cPhone;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	public Advisor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}

	public List<Portfolio> getPortfolios() {
		return portfolios;
	}

	public void setPortfolios(List<Portfolio> portfolios) {
		this.portfolios = portfolios;
	}
	
	

	}

