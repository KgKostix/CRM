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
@Table(name = "user")
public class User implements ListItem, Serializable {
	private static final long serialVersionUID = 8496662822563533549L;

	@Id
	@Column(name = "id", length = 5)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entity_seq_gen")
    @SequenceGenerator(name = "entity_seq_gen", sequenceName = "user_seq")
	private Long id;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "login", length = 20, unique = true, nullable = false)
	private String login;

	@Column(name = "password", length = 20, nullable = false)
	private String password;
	
	@Column(name = "email", length = 40, nullable = false)
	private String eMail;
	
	@Column(name = "birtday")
	private Date birthday;

	public User(){
	}
	
	public User(String login, String password, String eMail) {
		this(null, null, login, password, eMail, null);
	}

	public User(Long id, String name, String login, String password,
			String eMail, Date birthday) {
		this.id = id;
		this.name = name;
		this.login = login;
		this.password = password;
		this.eMail = eMail;
		this.birthday = birthday;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String getMnemo() {
		return name;
	}

}
