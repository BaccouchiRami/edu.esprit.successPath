package edu.esprit.successPath.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	private int idUser;
	private String nomUser;
	private String prenomUser;
	private String loginUser;
	private String passwordUser;
	
	public User(int idUser, String nomUser, String prenomUser, String loginUser, String passwordUser) {
		this.idUser = idUser;
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.loginUser = loginUser;
		this.passwordUser = passwordUser;
	}
	
	public User(String nomUser, String prenomUser, String loginUser, String passwordUser) {
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.loginUser = loginUser;
		this.passwordUser = passwordUser;
	}
	
	public User() {
		
	}
	
	@Id
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNomUser() {
		return nomUser;
	}
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
	public String getPrenomUser() {
		return prenomUser;
	}
	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idUser;
		result = prime * result
				+ ((loginUser == null) ? 0 : loginUser.hashCode());
		result = prime * result + ((nomUser == null) ? 0 : nomUser.hashCode());
		result = prime * result
				+ ((passwordUser == null) ? 0 : passwordUser.hashCode());
		result = prime * result
				+ ((prenomUser == null) ? 0 : prenomUser.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (idUser != other.idUser)
			return false;
		if (loginUser == null) {
			if (other.loginUser != null)
				return false;
		} else if (!loginUser.equals(other.loginUser))
			return false;
		if (nomUser == null) {
			if (other.nomUser != null)
				return false;
		} else if (!nomUser.equals(other.nomUser))
			return false;
		if (passwordUser == null) {
			if (other.passwordUser != null)
				return false;
		} else if (!passwordUser.equals(other.passwordUser))
			return false;
		if (prenomUser == null) {
			if (other.prenomUser != null)
				return false;
		} else if (!prenomUser.equals(other.prenomUser))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nomUser=" + nomUser
				+ ", prenomUser=" + prenomUser + ", loginUser=" + loginUser
				+ ", passwordUser=" + passwordUser + "]";
	}

}
