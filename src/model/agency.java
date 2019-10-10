package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="agency")
public class agency {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int agencyID;
	@Column(name="AGENCY_NAME")
	private String agencyName;
	@Column(name="AGENCY_ADDRESS")
	private String agencyAddress;
	@Column(name="AGENCY_PHONE")
	private String agencyPhone;
	@Column(name="AGENCY_EMAIL")
	private String agencyEmail;
	
	public agency() {
		super();
	}
	public agency(String agencyName, String agencyAddress, String agencyPhone, String agencyEmail) {
		super();
		this.agencyName = agencyName;
		this.agencyAddress = agencyAddress;
		this.agencyPhone = agencyPhone;
		this.agencyEmail = agencyEmail;
	}
	public agency(int agencyID, String agencyName, String agencyAddress, String agencyPhone, String agencyEmail) {
		super();
		this.agencyName = agencyName;
		this.agencyID = agencyID;
		this.agencyAddress = agencyAddress;
		this.agencyPhone = agencyPhone;
		this.agencyEmail = agencyEmail;
	}
	public int getAgencyID() {
		return agencyID;
	}
	public void setAgencyID(int agencyID) {
		this.agencyID = agencyID;
	}
	
	public String getAgencyAddress() {
		return agencyAddress;
	}
	public void setAgencyAddress(String agencyAddress) {
		this.agencyAddress = agencyAddress;
	}
	public String getAgencyPhone() {
		return agencyPhone;
	}
	public void setAgencyPhone(String agencyPhone) {
		this.agencyPhone = agencyPhone;
	}
	public String getAgencyEmail() {
		return agencyEmail;
	}
	public void setAgencyEmail(String agencyEmail) {
		this.agencyEmail = agencyEmail;
	}
	@Override
	public String toString() {
		return "agency [agencyID=" + agencyID + ", agencyName=" + agencyName + ", agencyAddress=" + agencyAddress
				+ ", agencyPhone=" + agencyPhone + ", agencyEmail=" + agencyEmail + "]";
	}
	

}
