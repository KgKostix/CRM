package com.company.crm.shared.dom;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact implements ListItem, Serializable {

	private static final long serialVersionUID = 2211792778573275048L;

	@Id
	@Column(name = "id", length = 5)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entity_seq_gen")
    @SequenceGenerator(name = "entity_seq_gen", sequenceName = "contact_seq")
	private Long id;
	
	@Column(name = "subject", nullable = false)
	private String subject;
	
	@Column(name = "content", length = 1000)
	private String content;
	
	@Column(name = "date_event")
	private Date dateevent;
	
	@Column(name = "comment")
	private String comment;
	
	@ManyToOne
	private ContactType type;
	
	@ManyToOne
	private Contragent contragent;
	
	@ManyToOne
	private User user;
	
	public Contact() {
	}
	
	public Contact(String subject, Date dateevent, User user) {
		super();
		this.subject = subject;
		this.dateevent = dateevent;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDateevent() {
		return dateevent;
	}

	public void setDateevent(Date dateevent) {
		this.dateevent = dateevent;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public ContactType getType() {
		return type;
	}

	public void setType(ContactType type) {
		this.type = type;
	}

	public Contragent getContragent() {
		return contragent;
	}

	public void setContragent(Contragent contragent) {
		this.contragent = contragent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String getMnemo() {
		return subject;
	}	
}
