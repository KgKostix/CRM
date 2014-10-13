package com.company.crm.shared.dom;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "contragent")
public class Contragent implements Serializable, ListItem {
	
	private static final long serialVersionUID = -7274746299315503332L;

	@Id
	@Column(name = "id", length = 5)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "entity_seq_gen")
    @SequenceGenerator(name = "entity_seq_gen", sequenceName = "contragent_seq")
	private Long id;
	
	@Column(name = "mnemo", length = 50, nullable = false)
	private String mnemo;
	
	@Column(name = "full_name", length = 100)
	private String fullName;
	
	@Column(name = "inn", length = 10)
	private String inn;
	
	@Column(name = "email", length = 40)
	private String eMail;
	
	@Column(name = "phone_number", length = 15)
	private String phoneNumber;
	
	@Column(name = "address", length = 50)
	private String address;
	
	@Column(name = "created")
	private Date created;

	public Contragent() {
		
	}
	
	public Contragent(String mnemo, String fullName, String inn) {
		super();
		this.mnemo = mnemo;
		this.fullName = fullName;
		this.inn = inn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMnemo() {
		return mnemo;
	}

	public void setMnemoe(String mnemo) {
		this.mnemo = mnemo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getInn() {
		return inn;
	}

	public void setInn(String inn) {
		this.inn = inn;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}	
}
