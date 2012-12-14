package edu.esprit.successPath.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sos implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idSos;
	private String descriptionSos;

	public Sos(int idSos, String descriptionSos) {
		this.idSos = idSos;
		this.descriptionSos = descriptionSos;
	}

	public Sos(String descriptionSos) {
		this.descriptionSos = descriptionSos;
	}

	public Sos() {

	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdSos() {
		return idSos;
	}

	public void setIdSos(int idSos) {
		this.idSos = idSos;
	}

	public String getDescriptionSos() {
		return descriptionSos;
	}

	public void setDescriptionSos(String descriptionSos) {
		this.descriptionSos = descriptionSos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descriptionSos == null) ? 0 : descriptionSos.hashCode());
		result = prime * result + idSos;
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
		Sos other = (Sos) obj;
		if (descriptionSos == null) {
			if (other.descriptionSos != null)
				return false;
		} else if (!descriptionSos.equals(other.descriptionSos))
			return false;
		if (idSos != other.idSos)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sos [idSos=" + idSos + ", descriptionSos=" + descriptionSos
				+ "]";
	}

}
