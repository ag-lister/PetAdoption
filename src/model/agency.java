package model;

public class agency {
	private int agencyID;
	private int petID;
	private String agencyAddress;
	private String agencyPhone;
	private String agencyEmail;
	public agency() {
		super();
	}
	public agency(String agencyAddress, String agencyPhone, String agencyEmail) {
		super();
		this.agencyAddress = agencyAddress;
		this.agencyPhone = agencyPhone;
		this.agencyEmail = agencyEmail;
	}
	public agency(int agencyID, int petID, String agencyAddress, String agencyPhone, String agencyEmail) {
		super();
		this.agencyID = agencyID;
		this.petID = petID;
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
	public int getPetID() {
		return petID;
	}
	public void setPetID(int petID) {
		this.petID = petID;
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
		return "agency [agencyID=" + agencyID + ", petID=" + petID + ", agencyAddress=" + agencyAddress
				+ ", agencyPhone=" + agencyPhone + ", agencyEmail=" + agencyEmail + "]";
	}

}
