package com.deepu.api.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * This is entity class, to create the bajaj finance into the database.
 */
@Entity
@Table(name = "bajaj")
public class BajajFinance {
	
	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bajajId;
	
	private String branchName;
	
	private String dealerName;
	
	private String productName;
	
	private String modelName;
	
	private String mobileNumber;
	
	private String firstName;
	
	private String lastName;
	
	private char gender;
	
	private String address;
	
	private String landMark;
	
	private int zipCode;
	
	private String bankName;
	
	private String bankIfsccode;
	
	//non parameterized constructor
	public BajajFinance() {
	}

	//parameterized constructor
	public BajajFinance(int bajajId, String branchName, String dealerName, String productName, String modelName,
			String mobileNumber, String firstName, String lastName, char gender, String address, String landMark,
			int zipCode, String bankName, String bankIfsccode) {
		
		this.bajajId = bajajId;
		this.branchName = branchName;
		this.dealerName = dealerName;
		this.productName = productName;
		this.modelName = modelName;
		this.mobileNumber = mobileNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.landMark = landMark;
		this.zipCode = zipCode;
		this.bankName = bankName;
		this.bankIfsccode = bankIfsccode;
	}

	public int getBajajId() {
		return bajajId;
	}

	public void setBajajId(int bajajId) {
		this.bajajId = bajajId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankIfsccode() {
		return bankIfsccode;
	}

	public void setBankIfsccode(String bankIfsccode) {
		this.bankIfsccode = bankIfsccode;
	}

	@Override
	public String toString() {
		return "BajajFinance [bajajId=" + bajajId + ", branchName=" + branchName + ", dealerName=" + dealerName
				+ ", productName=" + productName + ", modelName=" + modelName + ", mobileNumber=" + mobileNumber
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", address=" + address
				+ ", landMark=" + landMark + ", zipCode=" + zipCode + ", bankName=" + bankName + ", bankIfsccode="
				+ bankIfsccode + "]";
	}
	
	
	
	
	
	
	
}