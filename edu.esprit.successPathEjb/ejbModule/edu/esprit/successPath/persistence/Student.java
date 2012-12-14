package edu.esprit.successPath.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student implements Serializable {

	private int idStudent;
	private String login;
	private String pwd;

	public Student(String login, String pwd) {

		this.login = login;
		this.pwd = pwd;
	}

	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
