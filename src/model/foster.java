package model;

public class foster {
	private int id;
	private String name;
	private String address;
	private String phoneNumber;
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
