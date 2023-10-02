package com.wellsfargo.counselor.entity;


import java.util.List;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long advisorId;

    @Column(nullable = false)
    private String aFirstName;

    @Column(nullable = false)
    private String aLastName;

    @Column(nullable = false)
    private String aAddress;

    @Column(nullable = false)
    private String aPhone;
	@Column(nullable = false)
    private String aEmail;
    
    @Column(nullable = false)
    private String aPassword;

    @OneToMany(mappedBy = "advisor")
    private List<Client> client;

	public Advisor(long advisorId, String aFirstName, String aLastName, String aAddress, String aPhone, String aEmail,
			String aPassword, List<Client> client) {
		super();
		this.advisorId = advisorId;
		this.aFirstName = aFirstName;
		this.aLastName = aLastName;
		this.aAddress = aAddress;
		this.aPhone = aPhone;
		this.aEmail = aEmail;
		this.aPassword = aPassword;
		this.client = client;
	}

	public long getAdvisorId() {
		return advisorId;
	}

	public String getaFirstName() {
		return aFirstName;
	}

	public void setaFirstName(String aFirstName) {
		this.aFirstName = aFirstName;
	}

	public String getaLastName() {
		return aLastName;
	}

	public void setaLastName(String aLastName) {
		this.aLastName = aLastName;
	}

	public String getaAddress() {
		return aAddress;
	}

	public void setaAddress(String aAddress) {
		this.aAddress = aAddress;
	}

	public String getaPhone() {
		return aPhone;
	}

	public void setaPhone(String aPhone) {
		this.aPhone = aPhone;
	}

	public String getaEmail() {
		return aEmail;
	}

	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}

	public String getaPassword() {
		return aPassword;
	}

	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}

	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}
	
	
    
	
   
}

