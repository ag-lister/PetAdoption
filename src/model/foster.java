package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="foster")
public class Foster {
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
	
	public Foster() {
		super();
	}
	public Foster(int id, String name, String address, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public Foster(String name, String address, String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
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
	@Override
	public String toString() {
		return "foster [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}


}
