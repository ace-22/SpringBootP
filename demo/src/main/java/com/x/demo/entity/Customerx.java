package com.x.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins="*")
@Entity
@Table(name="customer")
public class Customerx {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="credit_card")
	private String credit_card;
	
	@Column(name="debit_card")
	private String debit_card;
	
	@Column(name="asset")
	private String asset;
	
	@Column(name="loan_req")
	private String loan_req;
	
	public Customerx() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCredit_card() {
		return credit_card;
	}

	public void setCredit_card(String credit_card) {
		this.credit_card = credit_card;
	}

	public String getDebit_card() {
		return debit_card;
	}

	public void setDebit_card(String debit_card) {
		this.debit_card = debit_card;
	}

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	public String getLoan_req() {
		return loan_req;
	}

	public void setLoan_req(String loan_req) {
		this.loan_req = loan_req;
	}

	public Customerx(String name, String email, String credit_card, String debit_card, String asset, String loan_req) {
		
		this.name = name;
		this.email = email;
		this.credit_card = credit_card;
		this.debit_card = debit_card;
		this.asset = asset;
		this.loan_req = loan_req;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", credit_card=" + credit_card
				+ ", debit_card=" + debit_card + ", asset=" + asset + ", loan_req=" + loan_req + "]";
	}
	
	
	
}
