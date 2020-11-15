package metier;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement(name = "compte")
/*utilisation des annotations jaxbean sur attributs et pas sur les gets*/
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
	@XmlAttribute
	private int code;
	@XmlElement
	private double solde;
	/*ne serialize  pas cette attrribut*/
	@XmlTransient
	private Date dateCreatin;
	public Compte(int code, double solde, Date dateCreatin) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreatin = dateCreatin;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreatin() {
		return dateCreatin;
	}
	public void setDateCreatin(Date dateCreatin) {
		this.dateCreatin = dateCreatin;
	}

}
