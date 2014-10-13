package com.company.crm.shared.dom;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "contact_type")
public class ContactType implements ListItem , Serializable {
	
	private static final long serialVersionUID = -5432817369349416408L;

	@Id
	@Column(name = "id", length = 5)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "entity_seq_gen")
    @SequenceGenerator(name = "entity_seq_gen", sequenceName = "contact_type_seq")
	private Long id;
	
	@Column(name = "mnemo", length = 40)
	private String mnemo;

	public ContactType() {
	}
	
	public ContactType(String mnemo) {
		this(null, mnemo);
	}
	
	public ContactType(Long id, String mnemo) {
		this.id = id;
		this.mnemo = mnemo;
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

	public void setMnemo(String mnemo) {
		this.mnemo = mnemo;
	}	
}
