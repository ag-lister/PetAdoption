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
@Table(name="foster")
public class foster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="FOSTER_ID")
	private int id;
	@Column(name="FOSTER_NAME")
	private String name;
	@Column(name="FOSTER_ADDRESS")
	private String address;
	@Column(name="FOSTER_PHONE")
	private String phoneNumber;
	@ManyToOne
	@JoinColumn(name="AGENCY_ID")
	private int agencyID;
	public foster() {
		super();
	}
	public foster(int id, String name, String address, String phoneNumber, int agencyID) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.agencyID = agencyID;
	}
	public foster(String name, String address, String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public foster(String name, String address, String phoneNumber, int agencyID) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.agencyID = agencyID;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAgencyID() {
		return agencyID;
	}
	public void setAgencyID(int agencyID) {
		this.agencyID = agencyID;
	}
	@Override
	public String toString() {
		return "foster [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", agencyID=" + agencyID + "]";
	}
}
